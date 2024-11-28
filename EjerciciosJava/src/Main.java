//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String nuevaCasilla = "";
        String alfil = "\u2657";
        System.out.println("En que casilla quieres poner el alfil?");
        String casillaOcupada = myObj.nextLine();

        do{
            ArrayList<String> movimientos = crearTablero(casillaOcupada, alfil);
            System.out.println("A que casilla quieres moverte?(Escribe 1 para salir)");
            nuevaCasilla = myObj.nextLine();
            if(!nuevaCasilla.equals("1")){
                System.out.println(movimientos);
                if(movimientos.contains(nuevaCasilla)){
                    casillaOcupada = nuevaCasilla;
                    System.out.println("Casilla ocupada: " + casillaOcupada);
                }
                else {
                    System.out.println("Movimiento inválido");
                }
            }
        }while(!nuevaCasilla.equals("1"));
        System.out.println("Juego terminado");
    }

    public static ArrayList<String> crearTablero(String casillaOcupada, String alfil) {
        char letras[] = {'a','b','c','d','e','f','g','h'};

        String[][] tablero = new String[8][8];
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                String numero = Integer.toString(j+1);
                tablero[i][j] = letras[i] + numero;
            }
        }

        ArrayList<String> movimientos = posiblesMovimientos(casillaOcupada,tablero);

        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(tablero[i][j].equals(casillaOcupada)){
                    System.out.print("  " + alfil + "  ");
                }
                else if(movimientos.contains(tablero[i][j])){
                    System.out.print(" " + tablero[i][j] + " ");
                }
                else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        return movimientos;
    }

    public static ArrayList<String> posiblesMovimientos(String casillaOcupada, String[][] tablero){
        int [] indicesCasilla = new int[2];
        ArrayList<String> posiblesMovimientos = new ArrayList<String>();
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(tablero[i][j].equals(casillaOcupada)){
                    indicesCasilla[0] = i;
                    indicesCasilla[1] = j;
                }
            }
        }

        for(int i = 1; i + indicesCasilla[0] < 8 && i + indicesCasilla[1] < 8; i++){
            posiblesMovimientos.add(tablero[indicesCasilla[0] + i][indicesCasilla[1] + i]);
        }

        for(int i = 1; indicesCasilla[0] - i >= 0 && indicesCasilla[1] - i >= 0; i++){
            posiblesMovimientos.add(tablero[indicesCasilla[0] - i][indicesCasilla[1] - i]);
        }

        for(int i = 1; indicesCasilla[0] - i >= 0 && i + indicesCasilla[1] < 8; i++){
            posiblesMovimientos.add(tablero[indicesCasilla[0] - i][indicesCasilla[1] + i]);
        }

        for(int i = 1; i + indicesCasilla[0] < 8 && indicesCasilla[1] - i >= 0; i++){
            posiblesMovimientos.add(tablero[indicesCasilla[0] + i][indicesCasilla[1] - i]);
        }

        return posiblesMovimientos;
    }
}