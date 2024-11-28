package hilos.Simple1;

public class HiloEjemplo{

    public static void main(String[] args) throws InterruptedException {
        Hilo a = new Hilo();
        Hilo b = new Hilo();
        Hilo c = new Hilo();
        Hilo d = new Hilo();
        Hilo e = new Hilo();


        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();
        d.start();
        d.join();
        e.start();

    }

}
