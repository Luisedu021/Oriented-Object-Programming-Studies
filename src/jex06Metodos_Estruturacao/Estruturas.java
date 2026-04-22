package jex06Metodos_Estruturacao;

public class Estruturas {

    double dividir(int divisor,int dividendo)throws Exception{
    if(divisor == 0){
        throw new Exception("Nao eh possivel dividir por 0");

    }
        return (double) dividendo / divisor;

        }



}
