package hilos.carrera;

public class Corredor extends Thread {
    String nombre;
    public Corredor(String nombre){
        this.nombre = nombre;
    }

    public void metroRecorrido(String nombre) throws InterruptedException {
        for(int i = 0; i< 1500; i++){
            Thread.sleep(10);
        }
        System.out.println("El corredor "+nombre+" ha terminado.");
    }
    public void run(){
        try {
            metroRecorrido(nombre);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
