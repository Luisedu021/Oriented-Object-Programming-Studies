package je03_indentacao;

public class BoletimEstudantil {
    public static void main(String[] args){
        double MediaFinal = 4;

        if(MediaFinal < 6.0){
            System.out.println("Reprovado");

        }
        else if (MediaFinal ==  6.0) {
            System.out.println("Minerva");
        }
        else{
            System.out.println("Aprovado");
        }
        for(int x = 1;x < 5;x++){
            System.out.println(x);
            if(x == 4){
                System.out.println("Elemento 4");
            }
        }


    }
}
