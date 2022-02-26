import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //variaveis primitivas - inteiros
        byte baite;
        short xort;
        int inte;
        long longo;
        //variaveis primitivas - flutuantes
        float flote;
        double dobow;
        //outras
        char xar;
        boolean boleano;

        // comentarios
        /*

         */

        //classes
        String estringa = "Lusca";

        //declarando variaveis com tamanho grande
        double saldoDaContaCorrente; //primeira letra minuscula, as demais iniciais maiusculas;
        //declarando uma constante
        final int MATRICULA_INATEL = 137; //Constantes usamos todas as letras maiusculas

        //casting de variáveis
        double numbro = 134.56;
        int namber;
        namber = (int)numbro;

        //entrada de dados
        //Classe Scanner
        Scanner input = new Scanner(System.in);
        //lendo
        /*
        System.out.println("entre com o nome:");
        String entrada = input.nextLine();
        System.out.println("entre com a idade:");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Entre com o curso");
        String curso = input.nextLine();

        //saida de dados
        System.out.println("Entrada: " + entrada + "\nIdade = " + idade + "\nCurso = " + curso);

        //controle if else (< > >= <= != == && ||)
        if (idade > 25){
            System.out.println("Voçê é velho");
        }else{
            System.out.println("Novinho");
        }
        //if em uma linha
        String resultado = (idade > 25) ? "Véio" : "Novinho";
        System.out.println(resultado);

        //repetição
        int i = 0;
        while(i<20){
            System.out.println(i);
            i++;
        }

        for(int j = 0; j<=20;j++){
            System.out.println(j);
        }
        */
        //rodar programa
        boolean flag = true;
        while (flag){
            int num1, num2;

            System.out.println("1 - Soma \n2 - Subtração \n3 - Sair");
            int operador = input.nextInt();
            input.nextLine();
            switch (operador){
                case 1:
                    System.out.println("Entre com o primeiro numero:");
                    num1 = input.nextInt();
                    input.nextLine();
                    System.out.println("Entre com o segundo numero");
                    num2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Soma = " + (num1+num2));
                    break;
                case 2:
                    System.out.println("Entre com o primeiro numero:");
                    num1 = input.nextInt();
                    input.nextLine();
                    System.out.println("Entre com o segundo numero");
                    num2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Subtração = " + (num1-num2));
                    break;
                case 3:
                    System.out.println("Saindo.......");
                    flag = false;
                    break;
            }

        }

    }


}
