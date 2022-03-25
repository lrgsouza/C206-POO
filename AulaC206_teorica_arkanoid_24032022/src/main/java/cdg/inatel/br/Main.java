package cdg.inatel.br;

import cdg.inatel.br.Bloco.Bloco;
import cdg.inatel.br.jogador.Jogador;

public class Main {
    public static void main(String[] args) {

        //criando array de blocos
        Bloco[] blocos = new Bloco[50];

        //criando jogador
        Jogador jogador = new Jogador();

        //criando 50 blocos
        for (int i = 0; i < 50; i++) {
            blocos[i] = new Bloco();
        }
        //imprimindo
        int nBlocoDestruidos = 0;
        System.out.println(Bloco.nBlocos + " Blocos Criados");

        //batendo em 12 blocos
        for (int i = 0; i < 12; i++) {
            jogador.bater(blocos[i]);
            nBlocoDestruidos++;
        }
        System.out.println(nBlocoDestruidos + " Blocos Destruidos");
        //pontuacao
        System.out.println("Pontuação final: " + Jogador.getPontuacao());

        //convertendo pontos
        int moedas = Jogador.pointConverter();
        System.out.println("Convertendo "+Jogador.getPontuacao()+" pontos em moedas...");
        System.out.println("Jogador agora tem: "+ moedas +" moedas");

    }
}
