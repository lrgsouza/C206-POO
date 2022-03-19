package br.inatel.cdg.jogador;
//imports
import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    //atributos
    private String nome;
    private double vida;
    private String tipoTiro;

    //construtor
    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
        System.out.println("Nave "+nome+" criada com sucesso");
    }

    //metodos
    public void atirar(Asteroide ast){
        switch (this.tipoTiro){
            case "Normal":
                if (ast.getTipoAsteroide().equals("Explosivo")){
                    ast.destruir();
                }else{
                    System.out.println("Tiro inefectivo!");
                }
                break;
            case "Explosivo":
                    ast.destruir();
                break;
        }
    }
    public void setVida(double vida) {
        this.vida = vida;
        System.out.println("Vida modificada para: "+vida);
    }
}
