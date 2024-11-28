package procesos.Ejercicio9;

import java.io.*;
import java.util.Scanner;

public class Leerweb {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cuantas webs deseas visitar");
        int num = scanner.nextInt();
        String cadena = "";
        for (int i = 0; i < num; i++) {
            System.out.println("Dime la url de una web que desees visitar");
            String url = scanner.next();
            cadena += url + "@";
        }

        Process p = (new ProcessBuilder("java", "VisitarWeb.java").directory(new File("EjerciciosJava/src/procesos/Ejercicio9"))).start();

        OutputStream os = p.getOutputStream();
        os.write(cadena.getBytes());
        os.flush();
        os.close();

        InputStream is = p.getInputStream();
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        is.close();
    }
}
