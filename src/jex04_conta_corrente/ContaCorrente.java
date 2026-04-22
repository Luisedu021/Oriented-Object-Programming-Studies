package jex04_conta_corrente;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    int numConta;
    int numAgencia;
    String nomeCliente;
    String nasci;
    Double saldo;
    boolean ativo = true;

    LocalDate data;


    // List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
       // return List;
    //}

    void sacar(Double valor){

    }

    void transfere(ContaCorrente contaDestino,Double valorTransferido){

    }

    void cancelar(String justificativa){
        ativo = false;
    }

    Double consultarSaldo(){
        return saldo;
    }


}
