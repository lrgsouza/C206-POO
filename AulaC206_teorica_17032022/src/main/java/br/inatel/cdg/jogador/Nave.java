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
                if (ast.getTipoAsteroide() == "Pequeno"){
                    ast.destruir();
                }else{
                    System.out.println("Tiro inefectivo!");
                }
                break;
            case "Explosivo":
                if (ast.getTipoAsteroide() == "Grande"){
                    ast.destruir();
                }else{
                    System.out.println("Tiro inefectivo!");
                }
                break;
        }
        /*
        if (this.tipoTiro == "Normal" && ast.getTipoAsteroide() == "Pequeno"){
            ast.destruir();
        }else if (this.tipoTiro == "Explosivo" && ast.getTipoAsteroide() == "Grande"){
            ast.destruir();
        }*/
    }
    public void setVida(double vida) {
        this.vida = vida;
        System.out.println("Vida modificada para: "+vida);
    }
}
