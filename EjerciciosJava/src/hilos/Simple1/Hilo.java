package hilos.Simple1;

public class Hilo extends Thread {
    static int num = 0;

    public void run() {
        num += 1000;
        System.out.println("Contador: " + num);
    }
}
