package procesos.Ejercicio10;

import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        boolean correcto = false;
        int cont = 1;
        while(!correcto && cont <= 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe un email");
            String email = sc.nextLine();
            System.out.println("Escribe un nombre");
            String nombre = sc.nextLine();

            Process p = (new ProcessBuilder("java", "ValidaMail.java").directory(new File("EjerciciosJava/src/procesos/Ejercicio10"))).start();

            OutputStream os = p.getOutputStream();
            os.write((email + "\n").getBytes());
            os.write(nombre.getBytes());
            os.flush();
            os.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if(line.equals("Felicidades, el email es valido")){
                    correcto = true;
                }
            }
            if(!correcto){
                System.out.println("Te quedan " + (3 - cont) + " intentos");
                cont++;
            }

        }





    }
}
