package curso_rocketseat.je03_indentacao.Break_continue;

public class ExemploDoWhile {
    private static int numeroTentativas = 0;
    public static void main(String[] args){
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando");
        }while(tocando());
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;

        if(!atendeu)
            numeroTentativas++;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
