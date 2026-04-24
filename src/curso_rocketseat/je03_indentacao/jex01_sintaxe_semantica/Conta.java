package jex01_sintaxe_semantica;

public class Conta {

    double saldo = 10.00;
    double antigo_saldo = 10.00;

    public void sacar(Double valor){
        saldo = saldo -  valor;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo antigo: " + antigo_saldo);
        System.out.println("NovoSaldo: " + saldo);

    }
}


