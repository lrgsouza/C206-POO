import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Qual tabela verdade quer? \n1 - E \n2 - OU");
        int tabela = inp.nextInt();
        switch (tabela){
            case 1:
                System.out.println("A | B | S");
                System.out.println("0 | 0 | 0");
                System.out.println("0 | 1 | 0");
                System.out.println("1 | 0 | 0");
                System.out.println("1 | 1 | 1");
                break;
            case 2:
                System.out.println("A | B | S");
                System.out.println("0 | 0 | 0");
                System.out.println("0 | 1 | 1");
                System.out.println("1 | 0 | 1");
                System.out.println("1 | 1 | 1");
                break;
        }
    }
}
