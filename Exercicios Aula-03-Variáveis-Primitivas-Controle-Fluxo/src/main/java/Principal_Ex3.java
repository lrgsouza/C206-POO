import java.util.Scanner;

//Exercício 3 –Vida de Estudante!
public class Principal_Ex3 {
    public static void main(String[] args) {

        //declarando variáveis
        Scanner input = new Scanner(System.in);
        int NPA = 0;
        int NP3 = 0;

        //lendo NPA
        System.out.println("Entre com o valor da NPA:");
        NPA = input.nextInt();

        //validando NPA
        if(NPA >= 60){
            System.out.println("Parabéns, você foi aprovado!");
        }
        else if (NPA < 30) {
            System.out.println("Poxa vida em, você foi reprovado! Te vejo semestre que vem.");
        }
        else {
            //lendo NP3
            System.out.println("Você ficou para NP3, favor entrar com a nota:");
            NP3 = input.nextInt();
            //calculando NFA
            int NFA = (NPA+NP3)/2;
            if(NFA >= 50){
                System.out.println("Parabéns, foi aprovado mas bateu na trave em!");
            }else{
                System.out.println("Agora suas chances acabaram, reprovado :( Te vejo semestre que vem.");
            }
        }

    }
}
