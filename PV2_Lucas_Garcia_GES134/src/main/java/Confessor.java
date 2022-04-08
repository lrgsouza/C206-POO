public class Confessor extends Personagem implements Cura{

    public Confessor(String nome, String tipoArma){
        super(nome, tipoArma);
        this.fe += 5;
        this.inteligencia -= 2;
        this.vitalidade -= 2;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
    }

    @Override
    public void ganhaHabilidade() {
        System.out.println(nome+ " Adiquiriu nova habilidade!");
    }

    @Override
    public void aprendeCura() {
        System.out.println(nome+ " Aprendeu a curar!");
    }

    @Override
    public void curar() {
        System.out.println(nome+ " Curou");
    }
}
