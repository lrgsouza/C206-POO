package cdg.inatel.br;

import cdg.inatel.br.Bomba.Bomba;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bomba campo[][] = new Bomba[2][2];
        Bomba bomba = new Bomba();

        //gerando posição aleatoria y
        Random rand = new Random();
        int y = rand.nextInt(2);
        int x = rand.nextInt(2);

        //alocando bomba
        campo[y][x] = bomba;

        //leitor
        Scanner in = new Scanner(System.in);

        boolean run = true;
        int pontos = 0;
        //perguntando posição
        while (run){
            System.out.println("Entre com as coordenadas (x y): ");
            int j = in.nextInt();
            //in.nextLine();
            //System.out.println("Entre com a coordenada y (0 ou 1): ");
            int k = in.nextInt();
            if (campo[k][j] == null){
                System.out.println("Você acertou, parabéns!");
                pontos++;
            }else{
                System.out.println("====== LOSER ! ======");
                System.out.println("Você explodiu!");
                run = false;
            }
            if (pontos == 3){
                System.out.println("====== WINNER ! ======");
                System.out.println("Todos espaços em brandos encontrados, PARABÉNS !!!");
                run = false;
            }

        }

    }
}
