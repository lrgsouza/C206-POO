package br.inatel.cdg.inimigo;
//imports
import br.inatel.cdg.jogador.Nave;

public class Asteroide {
    //atributos
    private String nome;
    private String tipoAsteroide;

    //construtor
    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
        System.out.println("Um asteroide "+tipoAsteroide+" foi adicionado!");

    }

    //metodos
    public void destruir(){
        System.out.println("Asteroide "+this.nome+" destruido!");
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}
