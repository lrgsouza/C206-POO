public abstract class Personagem {
    public static int cont= 0;
    protected String nome;
    protected int id;
    protected int poder;

    public Personagem(String nome, int poder){
        this.nome = nome;
        this.id = cont;
        this.poder = poder;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("Nome : "+this.nome);
        System.out.println("ID : "+this.id);
        System.out.println("Poder : "+poder);
    }

    public void travarBatalha(){}

}
