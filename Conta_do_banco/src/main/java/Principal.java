public class Principal {

    public static void main(String[] args) {

        int x =10;
        Conta conta_lucas = new Conta("Lucas",2500, 01, 01,"CC");
        Conta conta_airton = new Conta("Airton",2000, 01, 02,"Poupança");

        //chamando metodo pix
        conta_lucas.pix(conta_airton,500);

        System.out.println("Saldo da conta " + conta_lucas.nome + " é " + conta_lucas.saldo);
        System.out.println("Saldo da conta " + conta_airton.nome + " é " + conta_airton.saldo);
    }
}
