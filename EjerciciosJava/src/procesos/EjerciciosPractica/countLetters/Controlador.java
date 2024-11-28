package procesos.EjerciciosPractica.countLetters;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra para contar cuantas hay en el texto ");
        char caracter = scanner.next().charAt(0);
        Process p = new ProcessBuilder("java", "Coincidencia.java").directory(new File("EjerciciosJava/src/procesos/EjerciciosPractica/countLetters")).start();

        OutputStream os = p.getOutputStream();
        os.write(caracter);
        os.flush();
        os.close();

        InputStream is = p.getInputStream();
        int c;
        while((c = is.read()) != -1){
            System.out.print((char)c);
        }
        is.close();
    }
}
