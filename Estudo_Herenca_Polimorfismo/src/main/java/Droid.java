public class Droid extends Personagem{
    private boolean hostil;

    public Droid(String nome, int poder, boolean hostil){
        super(nome, poder);
        this.hostil = hostil;
    }

    public void hackearSistema(){
        System.out.println(nome+" hackeou o sistema da nave");
    }

    @Override
    public void travarBatalha() {
        if (this.hostil) {
            System.out.println(nome + " travou batalha contra um Jedi");
        }else {
            System.out.println(nome + " travou batalha contra um Sith");
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Hostil : "+this.hostil);
    }
}
