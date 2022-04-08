public class Nave {
    private String nome;
    public Personagem[] personagem;
    private boolean velocidadeLuz;

    public Nave(String nome, Personagem[] personagem, boolean velocidadeLuz){
        this.nome = nome;
        this.personagem = personagem;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("========informações da nave========");
        System.out.println("Nome da nave: "+nome);
        System.out.println("Tem velocidade da luz: "+velocidadeLuz);
        System.out.println("=====informações dos ocupantes=====");
        for (int i = 0; i < personagem.length; i++) {
            if(personagem[i] != null){
                personagem[i].mostraInfo();
            }
            System.out.println("==================================");
        }

    }

}
