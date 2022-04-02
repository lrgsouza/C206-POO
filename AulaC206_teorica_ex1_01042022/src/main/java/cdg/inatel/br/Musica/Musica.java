package cdg.inatel.br.Musica;

public class Musica {

    private String nome;
    private double duracao;

    //construtor
    public Musica(String nome, double duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }
}
