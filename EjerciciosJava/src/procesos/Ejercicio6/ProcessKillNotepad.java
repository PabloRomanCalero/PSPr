package procesos.Ejercicio6;

import java.io.IOException;

public class ProcessKillNotepad {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("bash", "-c", "kwrite" );
        Process p = pb.start();
        Thread.sleep(10000);
        p.destroy();
    }
}
