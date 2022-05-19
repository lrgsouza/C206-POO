import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("Joao",123123123);
        Cliente cliente2 = new Cliente("Pedro",543543543);
        Cliente cliente3 = null;
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        Conta conta1 = new Conta(500,100,clientes.get(0));
        Conta conta2 = new Conta(500,100,clientes.get(1));
        Conta conta3 = new Conta(500,100,clientes.get(2));

        //mostrando info
        conta1.mostraInfo();
        conta2.mostraInfo();
        conta3.mostraInfo();

        //finalizando
        System.out.println("Terminei");

    }
}
