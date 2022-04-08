public class Samurai extends Personagem implements Cura{
    private int honra = 10;

    public Samurai(String nome, String tipoArma){
        super(nome, tipoArma);
        this.vitalidade += 5;
        this.inteligencia -= 2;
        this.fe -= 2;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Honra: "+honra);
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
        this.honra += 1;
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
