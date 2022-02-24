import java.util.Scanner;

//Exercício 4 –Sala de Aula!
public class Principal_Ex4 {
    public static void main(String[] args) {
        //declarando variáveis
        Scanner input = new Scanner(System.in);

        //lendo quantidade de alunos
        System.out.println("Entre com a quantidade de alunos:");
        int qtdAlunos = input.nextInt();

        //verificando qual a melhor sala
        switch (qtdAlunos){
            case 10, 20 -> System.out.println("A sala utilizada pode ser a I-15");
            case 30 -> System.out.println("A sala utilizada pode ser a I-22");
            default -> System.out.println("O CRA deverá ser consultado para lhe fornecer a sala adequada, obrigado.");
        }
    }
}
