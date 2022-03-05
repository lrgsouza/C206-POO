public class Conta {

    private double saldo, limite;

    //construtor
    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
        System.out.println("Conta criada com sucesso!");
    }

    void sacar(double quantia){
        saldo -= quantia;
    }

    void depositar(double quantia){
        saldo += quantia;
    }

    //Getters e Setter
    public double getSaldo() {
        return saldo;
    }

}
