package hilos.carrera;

public class Main {
    public static void main(String[] args) {
        String[] corredores = { "Hicham El Guerrouj", "Noah Ngeny", "Mohamed Farah", "Bernard Lagat", "Rashid Ramzi", "Ryan Gregson", "Fermín Cacho", "Teddy Flack"};

        Corredor corredor1 = new Corredor(corredores[0]);
        Corredor corredor2 = new Corredor(corredores[1]);
        Corredor corredor3 = new Corredor(corredores[2]);
        Corredor corredor4 = new Corredor(corredores[3]);
        Corredor corredor5 = new Corredor(corredores[4]);
        Corredor corredor6 = new Corredor(corredores[5]);
        Corredor corredor7 = new Corredor(corredores[6]);
        Corredor corredor8 = new Corredor(corredores[7]);

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        corredor6.start();
        corredor7.start();
        corredor8.start();
    }
}
