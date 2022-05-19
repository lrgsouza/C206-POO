import java.util.*;

public class Conta {
    private double saldo;
    private double limite;
    public Set<Cliente> clientes = new HashSet<Cliente>();

    public Conta(double saldo, double limite, Cliente cliente) {
        this.saldo = saldo;
        this.limite = limite;
        clientes.add(cliente);
    }

    public void sacar(double quantia) throws SaldoInsuficienteException{
        if (quantia < (saldo+limite)) {
            this.saldo -= quantia;
        }else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }

    public void mostraInfo(){
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        for (Cliente c: clientes) {
            try {
                System.out.println("Nome :" + c.getNome());
                System.out.println("CPF :" + c.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e);
                System.out.println("Não existe cliente nesta posição!");
            }finally {
                System.out.println("");
            }
        }

    }

}
