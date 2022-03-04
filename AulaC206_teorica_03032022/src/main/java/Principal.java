public class Principal {
    public static void main(String[] args) {

        //declarando objetos
        Ashen personagem = new Ashen("Ashen", 200);
        personagem.arma = new Arma("Double Blade", 8000, 10000, "Espada de atacar monstrão");

        //levando dano
        personagem.tomarDano();
        personagem.tomarDano();

        //usando arma
        personagem.usarArma();
        personagem.usarArma();

        //mostrando info arma
        System.out.println(personagem.arma.toString());

        //mostrando vida do Ashen
        System.out.println("Vida atual: "+ personagem.vida);

    }
}
