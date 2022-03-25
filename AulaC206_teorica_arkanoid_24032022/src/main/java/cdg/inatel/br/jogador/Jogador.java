package cdg.inatel.br.jogador;
import cdg.inatel.br.Bloco.Bloco;
import cdg.inatel.br.Main;

public class Jogador {
    //stributos
    private static int pontuacao = 0;

    //construtor
    public Jogador(){
        System.out.println("Start the Game! Player created");
    }

    //quebrando blocos
    public void bater(Bloco bloco){
        bloco.destruir();
        pontuacao++;
    }

    //conversor
    public static int pointConverter(){
        return pontuacao * 100;
    }

    public static int getPontuacao() {
        return pontuacao;
    }
}
