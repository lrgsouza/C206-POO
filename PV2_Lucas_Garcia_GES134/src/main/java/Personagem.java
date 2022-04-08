
public abstract class Personagem {
    public static int contador = 0;
    protected String nome;
    protected int vitalidade = 10;
    protected int inteligencia = 10;
    protected int fe = 10;
    public Arma arma;

    public Personagem(String nome, String tipoArma){
        contador++;
        this.nome = nome;
        this.arma = new Arma(tipoArma);
    }

    public void mostraInfo(){
        System.out.println("=========Dados do personagem==========");
        System.out.println("Nome: "+nome);
        System.out.println("Vitalidade: "+vitalidade);
        System.out.println("Inteligencia: "+inteligencia);
        System.out.println("Fé: "+fe);
        System.out.println("Arma: "+arma.getTipo());
    }

    public void passaLevel(){
        this.vitalidade += 1;
        this.fe += 1;
        this.inteligencia += 1;
    }

    public abstract void ganhaHabilidade();

}
