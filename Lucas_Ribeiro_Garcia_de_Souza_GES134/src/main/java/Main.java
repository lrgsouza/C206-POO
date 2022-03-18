import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarando variaveis/objetos
        Time time = new Time("Palmeiras","Verde e branca");
        Estadio estadio = new Estadio("Palestra Itália", 60000,"São Paulo - SP");
        Jogador jogador;
        time.jogadores = new Jogador[10];

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
                    jogador = new Jogador();
                    System.out.println("Entrar com Nome:");
                    jogador.nome = input.nextLine();
                    System.out.println("Entrar com Salário:");
                    jogador.salario = input.nextInt();
                    input.nextLine();
                    System.out.println("Entrar com Número da Camisa:");
                    jogador.nCamisa = input.nextInt();
                    input.nextLine();
                    System.out.println("Entrar com nome Base:");
                    jogador.base = input.nextBoolean();
                    time.adicionaJogador(jogador);
                    break;
                case 2:
                    time.mostraInfo();
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("Salário total: "+time.calculaTotalSalario()+" R$");
                    System.out.println("=========================");
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
