package co.joaodev.banco;

public class App {

    public static void main(String[] args){
        System.out.println("Ola mundo!");


        Conta c1 = new Conta("0001", "1234", "Joao Gabriel Lima Santana");

        boolean feito = c1.Sacar(200.0);
        if (!feito){
            System.out.println("voce não tem saldo suficiente para sacar!");
        }

        c1.Depositar(100);
        c1.Depositar(50);
        c1.Depositar(100);

        if (!c1.Sacar(200)){
            System.out.println("voce não tem saldo suficiente para sacar!");
        } else {
            System.out.println("Saque efetuado");
        }

        if (!c1.Sacar(200)){
            System.out.println("voce não tem saldo suficiente para sacar!");
        } else {
            System.out.println("Saque efetuado!");
        }



    }
}
