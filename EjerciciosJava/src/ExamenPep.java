import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido al Examen");
        Scanner scanner = new Scanner(System.in);
        String cadena = "";
        while(!cadena.equals("salir")){
            System.out.println("Dime el comando sobre el que necesitas información(Linux)");
            cadena = scanner.nextLine();
            Process p = new ProcessBuilder("bash", "-c", "man " + cadena).start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String linea;
            int count = 0;

            if(!cadena.equals("salir")){
                if(br.readLine() != null){
                    while((linea = br.readLine()) != null && count < 7){
                        System.out.println(linea);
                        count++;
                    }
                }else{
                    System.out.println("Este comando no tiene man");
                }
                System.out.println();
            }

        }
        System.out.println("Has salido exitosamente");
    }
}