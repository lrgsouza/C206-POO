public class Ashen {

    //atributos
    String nome;
    int vida;
    Arma arma;

    //Construtor
    Ashen(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //metodos
    void usarArma() {
        arma.resistencia -= 2;
        System.out.println("5 diminuido da resistecia da " + arma.nome + ".");
    }
    void tomarDano() {
        vida -= 5;
        System.out.println(this.nome + " levou 5 de dano.");
    }
}
