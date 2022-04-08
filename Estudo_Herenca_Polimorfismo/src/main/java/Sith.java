public class Sith extends Personagem implements Forca{

    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int poder, boolean darth){
        super(nome, poder);
        this.darth = darth;
        this.sabre = new Sabre("Branco");
    }

    public void corromperJedi(){
        if (this.darth && this.poder > 60){
            System.out.println(nome+" levou um Jedi para o lado negro da força");
        }else {
            System.out.println(nome+" ainda não consegue corromper Jedis");
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Darth : "+this.darth);
        System.out.println("Cor do sabre : "+this.sabre.getCor());
    }

    @Override
    public void usarForca() {
        System.out.println(nome+" usou o lado negro da força");
        this.poder += 3;
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
        System.out.println("O Sith "+nome+" trocou a cor do sabre para "+cor);
    }

    @Override
    public void travarBatalha() {
        System.out.println(nome+" travou batalha contra um Jedi");
        this.poder += 1;
    }


}
