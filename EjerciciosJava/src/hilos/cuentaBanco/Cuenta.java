package hilos.cuentaBanco;

public class Cuenta {
    int saldo;

    public Cuenta(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void restar(int cant, String nom){
        saldo -= cant;
        System.out.println(nom + " retira => " + cant + " ACTUAL(" + saldo + ")");


    }

    public void RetirarDinero(int cant, String nom){
        if(saldo >= cant){
            System.out.println(nom + ": SE VA A RETIRAR SALDO (ACTUAL ES: " + this.getSaldo() + ")");
            this.restar(cant, nom);
        }else{
            System.out.println(nom + ": No puede retirar dinero, NO HAY SALDO(" + this.getSaldo() + ")");
        }
    }
}
