package hilos.cuentaBanco;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cuenta cuenta1 = new Cuenta(2000);
        Cuenta cuenta2 = new Cuenta(1000);
        SacarDinero sacarDinero1 = new SacarDinero(cuenta1, "Pablo", 40);
        SacarDinero sacarDinero2 = new SacarDinero(cuenta2, "LaCuki", 60);
        sacarDinero1.start();
        sacarDinero2.start();

    }
}
