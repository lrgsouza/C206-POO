public class Principal {

    public static void main(String[] args) {

        int x =10;
        Conta conta_lucas = new Conta();
        Conta conta_airton = new Conta();
        conta_lucas.saldo = 2300;
        conta_airton.saldo = 1000;

        conta_lucas.pix(conta_airton,500);

        System.out.println(conta_lucas.saldo);
        System.out.println(conta_airton.saldo);
    }
}
