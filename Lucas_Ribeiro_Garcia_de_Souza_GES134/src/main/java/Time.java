
public class Time {
    Estadio estadio;
    String nome;
    String corCamisa;
    Jogador[] jogador = new Jogador[10];

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
        for (int i = 0; i < jogador.length; i++) {
            if (jogador[i]!=null){
                jogador[i].mostraInfo();
            }
        }

    }
    void adicionaJogador(Jogador[] jogadores){
        this.jogador = jogadores;
    }
    double calculaTotalSalario(){
        double somaSalario = 0;
        for (int i = 0; i < jogador.length; i++) {
            if (jogador[i]!=null){
                somaSalario += jogador[i].salario;
            }
        }
        return somaSalario;
    }
    void mostraJogadoresBase(){
        for (int i = 0; i < jogador.length; i++) {
            if (jogador[i]!=null){
                if (jogador[i].base){
                    jogador[i].mostraInfo();
                }
            }
        }
    }
}
