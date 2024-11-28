package procesos.Ejercicio8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Process {
    public static void main(String[] args) throws IOException{

        String cadena = "davidmarica";
        ProcessBuilder pb = new ProcessBuilder("java","Palindromo.java",cadena);
        pb.directory(new File("EjerciciosJava/src/procesos/Ejercicio8"));
        java.lang.Process pr=pb.start();

        OutputStream os = pr.getOutputStream();
        os.write(cadena.getBytes());
        os.flush();
        os.close();

        InputStream is=pr.getInputStream();
        int c;
        while ((c=is.read())!=-1){
            System.out.print((char)c);
        }
        is.close();

    }
}
