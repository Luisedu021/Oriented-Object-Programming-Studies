package Je08JavaBeans;

public class Aluno {
    private String nome;
    private int idade;

    public void setIdade(int newIdade){
        if(newIdade<0 || newIdade >120){
            throw new IllegalArgumentException("O valor da idade deve ser superior a 0");
        }
        this.idade = newIdade;
    }

    public void setNome(String newNome){
        this.nome = newNome;

    }
    public int getIdade(){
    return this.idade;
    }

    public String getNome(){
        return this.nome;
    }
}
