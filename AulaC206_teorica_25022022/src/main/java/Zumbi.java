public class Zumbi {
    double vida;
    String nome;

    public double mostraVida(){
        return vida;
    };

    public void transfereVida(String nome, double quantia){
        vida -= quantia;
    }


}
