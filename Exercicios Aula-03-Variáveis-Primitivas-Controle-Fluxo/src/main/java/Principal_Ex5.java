import java.util.Random;
import java.util.Scanner;

//Exercício 5 –Adivinhação!
public class Principal_Ex5 {
    public static void main(String[] args) {
        //declarando variáveis
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int y = -1;
        //gerando numero aleatório
        int x = rand.nextInt(10) + 1;
        String nov = " ";

        //jogando enquanto não adivinhar
        while (x != y){
            //lendo jogada
            System.out.println("Sua vez" + nov + ", tente adivinhar qual número foi gerado!");
            y = input.nextInt();
            nov = " novamente";

        }
        System.out.println("Parabéns você adivinhou!");
    }
}
