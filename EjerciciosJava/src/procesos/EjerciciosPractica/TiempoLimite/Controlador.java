package procesos.EjerciciosPractica.TiempoLimite;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Controlador {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = new ProcessBuilder("java", "Wait.java").directory(new File("EjerciciosJava/src/procesos/EjerciciosPractica/TiempoLimite")).start();
        boolean terminado = p.waitFor(10, TimeUnit.SECONDS);

        if(!terminado){
            p.destroy();
            System.out.println("El proceso fue abortado por exceder el tiempo límite.");
        }else{
            System.out.println("Proceso realizado con exito");
        }
    }
}
