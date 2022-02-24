import java.util.Random;
import java.util.Scanner;

//Exercício 6 –Adivinhação Aprimorado!
public class Principal_Ex6 {
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
            //verificando se o numero é maior ou menor
            if(y < x){
                System.out.println("Seu número é menor que o gerado!");
            }else if(y > x){
                System.out.println("Seu número é maior que o gerado!");
            }
        }
        System.out.println("Parabéns você adivinhou!");
    }
}
