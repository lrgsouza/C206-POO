import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarando variaveis/objetos
        Time time = new Time("Palmeiras","Verde e branca");
        Estadio estadio = new Estadio("Palestra Itália", 60000,"São Paulo - SP");
        Jogador[] jogadores = new Jogador[10];
        int nJogador = 0;

        //agregando estadio ao time
        time.estadio = estadio;

        //menu
        //Inicializando Scanner
        Scanner input = new Scanner(System.in);
        //iniciando menu
        boolean menuState = true;
        while (menuState) {
            System.out.println("Entre com a opção desejada:");
            System.out.println("1 - Cadastra jogador");
            System.out.println("2 - Mostrar todas as informações");
            System.out.println("3 - Calcular salário total");
            System.out.println("4 - Mostrar informações dos jogadores da base");
            System.out.println("0 - Sair");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    //instanciando novo jogador
                    for (int i = 0; i < jogadores.length; i++) {
                        if (jogadores[i] == null){
                        jogadores[i] = new Jogador();
                        System.out.println("Entrar com: Nome, Salário, Número da Camisa e base");
                        jogadores[i].nome = input.nextLine();
                        jogadores[i].salario = input.nextInt();
                        input.nextLine();
                        jogadores[i].nCamisa = input.nextInt();
                        jogadores[i].base = input.nextBoolean();
                        time.adicionaJogador(jogadores);
                        break;
                        }
                    }
                    break;
                case 2:
                    time.mostraInfo();
                    break;
                case 3:
                    System.out.println("Salário total: "+time.calculaTotalSalario());
                    break;
                case 4:
                    time.mostraJogadoresBase();
                    break;
                case 0:
                    menuState = false;
                    break;

            }
        }
    }
}
