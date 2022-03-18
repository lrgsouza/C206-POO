
public class Time {
    Estadio estadio;
    String nome;
    String corCamisa;
    Jogador[] jogadores;

    //construtor
    public Time(String nome, String corCamisa){
        //construindo
        this.nome = nome;
        this.corCamisa = corCamisa;
    }

    //metodos
    void mostraInfo(){
        //info do estadio
        System.out.println("Estádio: "+estadio.nome);
        System.out.println("Capacidade do estádio: "+estadio.capacidade);
        System.out.println("Cidade do estádio: "+estadio.cidade);
        //info Time
        System.out.println("Nome do time: "+nome);
        System.out.println("Cor da Camisa: "+corCamisa);
        //info jogadores
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i]!=null){
                jogadores[i].mostraInfo();
            }
        }

    }
    void adicionaJogador(Jogador jogador){
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] == null){
                jogadores[i] = jogador;
                break;
            }
        }
    }
    double calculaTotalSalario(){
        double somaSalario = 0;
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i]!=null){
                somaSalario += jogadores[i].salario;
            }
        }
        return somaSalario;
    }
    void mostraJogadoresBase(){
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i]!=null){
                if (jogadores[i].base){
                    jogadores[i].mostraInfo();
                }
            }
        }
    }
}
