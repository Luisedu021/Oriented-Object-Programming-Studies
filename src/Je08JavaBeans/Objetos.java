package Je08JavaBeans;

public class Objetos {
    public static void main(String[] args){
            Aluno Luis = new Aluno();
            Luis.setNome("Luis");
            Luis.setIdade(19);
        System.out.println("O seu nome é " + Luis.getNome());
        System.out.println("A sua idade é " + Luis.getIdade());

    }
}
