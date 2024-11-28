package procesos.Ejercicio7;

public class Sumador {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        Sumador sumador = new Sumador();
        System.out.println(sumador.suma(n1, n2));
    }

    public int suma(int n1, int n2) {
        int valorSuma = 0;
        for (int i = n1; i <= n2; i++) {
            valorSuma += i;
        }
        return valorSuma;
    }
}
