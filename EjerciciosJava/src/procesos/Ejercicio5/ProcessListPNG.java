package procesos.Ejercicio5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcessListPNG{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del directorio:");
        String ruta = scanner.nextLine();

            ProcessBuilder pb = new ProcessBuilder("bash","-c","ls " + ruta + "/*.png");
            Process p=pb.start();

            try{
                InputStream is = p.getInputStream();

                int c;
                while ((c = is.read()) != -1)
                    System.out.print((char) c);
                is.close();
            }catch(Exception e){
                    e.printStackTrace();
            }
    }



}
