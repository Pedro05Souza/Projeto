import java.util.ArrayList;
public class Alcateia {
    private int quantLobo;
    private ArrayList<Lobo> alcateia;
    
    public Alcateia(){
        this.quantLobo = quantLobo;
        alcateia = new ArrayList<Lobo>();
    }

    public void adicionaLobo(Lobo lobo, int quantLobo){
        if(consultaLoboPorNome(lobo.getNome() != null)){
            alcateia.add(lobo);
            quantLobo++;


        }
    }


    public Lobo consultaLoboPorNome(String nome){
        for(int i = 0;i<Lobo.size();i++){
            Lobo l = alcateia.get(i);
            if(l.getNome().equalsIgnoreCase(nome)){
                return l;
            }
        }
    }
}
