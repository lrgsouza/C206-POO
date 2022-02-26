public class Zombicide02 {
    public static void main(String[] args) {

        Zumbi z1;

        z1 = new Zumbi();

        z1.nome = "Gustavo";
        z1.vida = 500;

        System.out.println("Vida inicial = " + z1.mostraVida());

        System.out.println("zumbi levou dano de 50");

        z1.transfereVida(z1.nome, 50);

        System.out.println("Vida atual = " + z1.mostraVida());



    }

}
