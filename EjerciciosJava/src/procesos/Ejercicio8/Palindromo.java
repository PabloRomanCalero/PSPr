package procesos.Ejercicio8;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cadena = br.readLine();
        int mitad = cadena.length() / 2;
        String primeraMitad = cadena.substring(0, mitad);
        String segundaMitad = cadena.substring(mitad);
        boolean palindromo = true;
        int i = 1;


        while(i <= mitad && palindromo) {
            if(primeraMitad.charAt(i-1) == segundaMitad.charAt(segundaMitad.length() - i)) {
                i++;
            }else {
                palindromo = false;
            }

        }
        System.out.println("Es palindromo? " + palindromo);

        FileWriter fw = null;
        if(palindromo){
            try{
                fw = new FileWriter("palindromo.txt", true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            try{
                fw = new FileWriter("Nopalindromo.txt", true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        fw.write(cadena + ", ");
        fw.close();


        FileWriter fwAll = new FileWriter("todas.txt", true);
        fwAll.write(cadena + ", ");
        fwAll.close();
    }
}
