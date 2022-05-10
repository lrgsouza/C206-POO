public class Artista implements Comparable<Artista>{
    private String nome;
    private int ouvintesMensais;
    private String musicaMaisFamosa;
    private boolean internacional;

    @Override
    public int compareTo(Artista a) {
        return nome.compareTo(a.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOuvintesMensais() {
        return ouvintesMensais;
    }

    public void setOuvintesMensais(int ouvintesMensais) {
        this.ouvintesMensais = ouvintesMensais;
    }

    public String getMusicaMaisFamosa() {
        return musicaMaisFamosa;
    }

    public void setMusicaMaisFamosa(String musicaMaisFamosa) {
        this.musicaMaisFamosa = musicaMaisFamosa;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
}
