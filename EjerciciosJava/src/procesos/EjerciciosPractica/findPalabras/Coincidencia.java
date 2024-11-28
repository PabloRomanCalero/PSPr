package procesos.EjerciciosPractica.findPalabras;

import java.io.*;

public class Coincidencia {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cadena = br.readLine();

        if(cadena != null){
            boolean encontrado = false;
            FileReader fr = new FileReader("palabras.txt");
            BufferedReader br2 = new BufferedReader(fr);

            String line;
            while((line = br2.readLine()) != null && !encontrado){
                String[] splited = line.split(" ");
                for(String s : splited){
                    if(s.equals(cadena)){
                       encontrado = true;
                    }
                }

            }
            fr.close();

            FileWriter fw;
            if(encontrado){
                fw = new FileWriter("palabras.txt", false);
                fw.write("");
                fw.close();
            }else{
                fw = new FileWriter("palabras.txt", true);
                fw.write(cadena + " ");
                fw.close();
            }

        }
    }
}
