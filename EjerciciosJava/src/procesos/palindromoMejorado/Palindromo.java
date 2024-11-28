package procesos.palindromoMejorado;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cadena = br.readLine();

        Palindromo palindromo = new Palindromo();
        boolean esPalindromo = palindromo.esPalindromo(cadena);

        FileWriter fw;
        if(esPalindromo){
            fw = new FileWriter("palindromo.txt", true);
        }
        else{
            fw = new FileWriter("nopalindromo.txt", true);
        }
        fw.write(cadena + ", ");
        fw.close();

        fw = new FileWriter("todes.txt", true);
        fw.write(cadena + ", ");
        fw.close();
    }

    public boolean esPalindromo(String cadena) {
        String invertido = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(invertido);
    }
}
