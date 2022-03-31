package cdg.inatel.br.jogador;
import cdg.inatel.br.Bloco.Bloco;
import cdg.inatel.br.Main;

public class Jogador {
    //stributos
    private int pontuacao = 0;

    //construtor
    public Jogador(){
        System.out.println("Start the Game! Player created");
    }

    //quebrando blocos
    public void bater(Bloco bloco){
        bloco.destruir();
        pontuacao++;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
