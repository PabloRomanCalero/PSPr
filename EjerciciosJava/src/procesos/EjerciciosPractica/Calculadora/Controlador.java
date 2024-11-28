package procesos.EjerciciosPractica.Calculadora;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que operación desea realizar?(Suma, resta, multiplicación o división)");
        String operacion = scanner.nextLine().toLowerCase();
        System.out.println("Elige el valor del numero 1");
        int num1 = scanner.nextInt();
        System.out.println("Elige el valor del numero 2");
        int num2 = scanner.nextInt();

        String[] array = new String[] {"Valor1", "Valor2", "Valor3"};


        Process p = (new ProcessBuilder("java", "Calculadora.java").directory(new File("EjerciciosJava/src/procesos/EjerciciosPractica/Calculadora"))).start();

        OutputStream os = p.getOutputStream();
        os.write((operacion + '\n').getBytes());
        os.write((Integer.toString(num1) + '\n').getBytes());
        os.write((Integer.toString(num2) + '\n').getBytes());
        os.write((array[0]).getBytes());
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
