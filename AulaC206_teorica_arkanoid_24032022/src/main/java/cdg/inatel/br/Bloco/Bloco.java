package cdg.inatel.br.Bloco;
import cdg.inatel.br.Bloco.Bloco;

public class Bloco {

    //private
    private static int nBlocos = 0;

    public Bloco(){
        nBlocos++;
        System.out.println("Number of blocks: " + nBlocos);
    }

    public void destruir(){
        nBlocos--;
    }

    public static int getnBlocos() {
        return nBlocos;
    }
}
