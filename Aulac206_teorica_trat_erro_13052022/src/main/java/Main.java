public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao",123123123);
        Cliente cliente2 = new Cliente("Pedro",543543543);
        Cliente cliente3 = null;
        Conta conta1 = new Conta(500,100,cliente1);
        Conta conta2 = new Conta(500,100,cliente2);
        Conta conta3 = new Conta(500,100,cliente3);

        //mostrando info
        conta1.mostraInfo();
        conta2.mostraInfo();
        conta3.mostraInfo();

        //finalizando
        System.out.println("Terminei");

    }
}
