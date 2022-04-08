public class Astrologo extends Personagem implements Magia, Cura{

    public Astrologo(String nome, String tipoArma){
        super(nome, tipoArma);
        this.inteligencia += 5;
        this.vitalidade -= 2;
        this.fe -= 2;
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

    @Override
    public void aprendeFeitico() {
        System.out.println(nome+ " Aprendeu novo feitiço");
    }

    @Override
    public void usaFeitico(int Dano) {
        System.out.println(nome+" usou um feitiço com dano de "+Dano);
    }
}
