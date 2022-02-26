import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("teste");
        int[] num;
        num = new int[3];
        String operador;
        Scanner input = new Scanner(System.in);
        //lendo operação
        System.out.println("Qual operação deseja fazer? + - / * ou sair");
        operador = input.nextLine();
        //saindo se a opção for sair
        if(operador.equals("sair")){
            System.exit(0);
        }
        //lendo números
        System.out.println("Entre com dois números");
        for(int i =0;i<2;i++){
            num[i] = input.nextInt();
        }
        //efetuando calculo e mostrando resultado
        switch (operador) {
            case "+" -> System.out.println(Calcular.soma(num[0], num[1]));
            case "-" -> System.out.println(Calcular.subtrai(num[0], num[1]));
            case "*" -> System.out.println(Calcular.multiplica(num[0], num[1]));
            case "/" -> System.out.println(Calcular.divide(num[0], num[1]));
        }

    }
}

