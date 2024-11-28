package procesos.EjerciciosPractica.countLetters;

import java.io.*;

public class Coincidencia {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char caracter = br.readLine().charAt(0);
        int count = 0;
        FileReader fr = new FileReader("palabras.txt");
        BufferedReader br2 = new BufferedReader(fr);

        String line;
        while((line = br2.readLine()) != null){
            System.out.println(line);
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == caracter){
                    count++;
                }
            }
        }
        System.out.println("Hay un total de " + count + " '" + caracter +"'");
    }
}
