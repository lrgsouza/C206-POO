public class Piloto {
    String nome;
    boolean vilao;

    public Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    void soltarSuperPoder(){
        System.out.println(nome + " esta soltando Super Poder!!!");
    }
}
