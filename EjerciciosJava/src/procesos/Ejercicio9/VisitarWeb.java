package procesos.Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VisitarWeb {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String urls = br.readLine();
        String[] urlsArray = urls.split("@");
        System.out.println(urls);
        System.out.println(Arrays.toString(urls.split("@")));
        System.out.println(urlsArray[0]);

        if(urlsArray.length <= 3){
            for (String url : urlsArray) {
                Process p = new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", url).start();
            }
        }else{
            System.out.println("ERROR: Demasiadas webs");
        }

    }
}
