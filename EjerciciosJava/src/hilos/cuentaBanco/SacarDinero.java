package hilos.cuentaBanco;

public class SacarDinero extends Thread {
    private Cuenta c;
    private String nombre;
    private int cantidad;

    public SacarDinero(Cuenta c, String nombre, int cantidad) {
        this.c = c;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public void run(){
        c.RetirarDinero(this.cantidad, this.nombre);
    }
}
