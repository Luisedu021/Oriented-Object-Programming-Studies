package jex07Operadores;

public class Ternario {
    public static void main(String[] args) {
        String nome = "Luis";
        int idade = 20;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " é de maior" : "não é de maior");
        System.out.println(mensagem);


        boolean condicao1 = false;
        boolean condicao2 = true;

        if (1 == 1 && 2 < 3)
            System.out.println("0s dois valores precisam ser verdadeiro");
        ;

    }
}
