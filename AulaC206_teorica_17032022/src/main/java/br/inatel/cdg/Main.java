package br.inatel.cdg;
//imports
import br.inatel.cdg.jogador.Nave;
import br.inatel.cdg.inimigo.Asteroide;

public class Main {

    public static void main(String[] args) {
        //criando naves
        Nave nave1 = new Nave("Astron", 100.0, "Explosivo");
        Nave nave2 = new Nave("God", 200.0, "Normal");
        //criando asteroides
        Asteroide ast1 = new Asteroide("Roberto","Pequeno");
        Asteroide ast2 = new Asteroide("Rodrigo","Grande");
        //set vida
        nave1.setVida(200);
        //atirando
        nave1.atirar(ast1);
        nave1.atirar(ast2);
        nave2.atirar(ast1);
        nave2.atirar(ast2);

    }
}
