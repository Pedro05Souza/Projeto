import java.util.ArrayList;
import java.util.Random;

public class GeradorAlcateia {
    private ArrayList<Lobo> alcateia;

    public GeradorAlcateia(){
        alcateia = new ArrayList<>();
    }

    public ArrayList<Lobo> wolfPackGenerator(int quant){
        int iterador = 0;
        Random r = new Random();
        while(iterador < quant){
            Lobo l = new Lobo("bayo", r.nextInt(101));
            alcateia.add(l);
            iterador++;
        }
        return alcateia;
    }

    public void printWolf(){
        for (Lobo lobo : alcateia) {
            System.out.println("Nome Lobo: " + lobo.getNome());
            System.out.println("Idade Lobo: " + lobo.getIdade());
        }
    }
    
}
