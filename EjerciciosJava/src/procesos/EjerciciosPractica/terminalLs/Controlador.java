package procesos.EjerciciosPractica.terminalLs;

import java.io.IOException;
import java.io.InputStream;

public class Controlador {
    public static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("cmd.exe", "/c", "dir EjerciciosJava").start();

        InputStream is = p.getInputStream();
        int c;
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }

        InputStream es = p.getErrorStream();
        while ((c = es.read()) != -1) {
            System.err.print((char) c);
        }
    }
}
