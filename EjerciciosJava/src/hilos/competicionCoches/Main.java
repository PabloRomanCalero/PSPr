package hilos.competicionCoches;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Coche> arrayCoches = new ArrayList<Coche>();
        System.out.println("Ingrese el numero de coches a competir: ");
        int coches = scanner.nextInt();
        for (int i = 0; i < coches; i++) {
            System.out.println("Introduzca marca del coche "+(i+1));
            String marca = scanner.next();
            Coche coche = new Coche(marca, i+1);
            arrayCoches.add(coche);
            System.out.println("Coche creado: "+coche.marca+"("+coche.numero+")");
        }
        for (Coche coche : arrayCoches) {
            coche.start();
        }
    }
}
