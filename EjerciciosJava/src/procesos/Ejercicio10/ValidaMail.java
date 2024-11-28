package procesos.Ejercicio10;

import java.io.*;

public class ValidaMail {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String email = br.readLine();
        String nombre = br.readLine();

        System.out.println(email);
        System.out.println(nombre);
        String resultado = "";
        if(email.contains("@")) {
            String[] emailApartado = email.split("@");
            if(emailApartado[0].length() > 3){
                if(emailApartado[1].charAt(0) != '.' && emailApartado[1].contains(".")) {
                    String[] emailApartadoPunto = emailApartado[1].split("\\.");
                    if(emailApartadoPunto[1].equals("com") || emailApartadoPunto[1].equals("es") || emailApartadoPunto[1].equals("org")){
                        resultado = "Felicidades, el email es valido";
                    }else{
                        resultado = "ERROR: El dominio no es ni com/es/org!";
                    }
                }else{
                    resultado = "ERROR: No existe segundo identificador!";
                }
            }else{
                resultado = "ERROR: El primer identificador ha de tener una longitud mínima de 3 caracteres!";
            }
        }else{
            resultado = "ERROR: El email no contiene una @!";
        }
        System.out.print(resultado);
    }
}
