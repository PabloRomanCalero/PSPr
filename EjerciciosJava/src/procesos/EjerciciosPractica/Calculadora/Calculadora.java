package procesos.EjerciciosPractica.Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String operacion = br.readLine();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("Resultado: ");
        if(operacion.equals("suma")){
            System.out.println(num1 + num2);
        }
        else if(operacion.equals("resta")){
            System.out.println(num1 - num2);
        }
        else if(operacion.equals("multiplicación")){
            System.out.println(num1 * num2);
        }
        else if(operacion.equals("división")){
            System.out.println(num1 / num2);
        }
    }
}
