import java.util.Scanner;

//Exercício 2 –Zombicide2!
public class Principal_Ex2 {
    public static void main(String[] args) {

        //declarando variáveis
        Scanner input = new Scanner(System.in);
        int[] partida;
        partida = new int[3];
        int soma = 0;
        int media;

        //lendo valores das partidas
        int i;
        for(i = 0;i <= partida.length - 1;i++){
            partida[i] = input.nextInt();
            soma += partida[i];
        }

        //calculando média
        media = soma / i;

        //mostrando resultados
        System.out.print("Soma = " + soma + "\nMédia = " + media);

    }
}
