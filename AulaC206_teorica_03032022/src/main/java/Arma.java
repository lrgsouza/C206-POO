public class Arma {

    //atributos
    String nome;
    int poder;
    int resistencia;
    String descricao;

    //Construtor
    Arma(String nome, int poder, int resistencia ,String descricao){
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    //mostrar info
    @Override
    public String toString() {
        return "Arma{" +
                " nome='" + nome + '\'' +
                ", poder=" + poder +
                ", resistencia=" + resistencia +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
