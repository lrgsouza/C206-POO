public class Jedi extends Personagem implements Forca, Treinamento{

    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int poder, boolean mestre){
        super(nome, poder);
        this.mestre = mestre;
        this.sabre = new Sabre("Branco");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Mestre : "+this.mestre);
        System.out.println("Cor do sabre : "+this.sabre.getCor());
    }

    @Override
    public void usarForca() {
        System.out.println(nome+" usou a força para o bem");
        this.poder += 5;
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
        System.out.println("O Jedi "+nome+" trocou a cor do sabre para "+cor);
    }

    @Override
    public void travarBatalha() {
        System.out.println(nome+" travou batalha contra um sith");
        this.poder += 1;
    }

    @Override
    public void treinarPadawan() {
        if (this.mestre || this.poder > 70){
            System.out.println(nome+" treinou um Padawan");
        }else{
            System.out.println(nome+" ainda não consegue treinar padawans");
        }
    }
}
