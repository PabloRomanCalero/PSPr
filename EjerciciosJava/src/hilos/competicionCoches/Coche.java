package hilos.competicionCoches;
import java.util.Random;

public class Coche extends Thread {
    String marca;
    int numero;

    public Coche(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public void correr() throws InterruptedException {
        Random randomNumbers = new Random();
        boolean comprueba = false;
        int recorrido = 0;

        while(!comprueba) {
            recorrido+= randomNumbers.nextInt(100);
            if(recorrido >= 500){comprueba = true;
                System.out.println("El "+marca + "(" + numero + ") ha finalizado al recorrer "+recorrido+"km");}
            else{System.out.println(marca + "(" + numero + ") lleva recorrido "+recorrido+"km!");}
            Thread.sleep(1000);
        }
    }

    public void run(){
        try {
            correr();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
