public class Conta {
    //o que a conta tem de dados
    double saldo;
    int agencia;
    int numero;
    String tipodeconta;

    //o que a conta sabe fazer
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo =+ valor;
    }
    public void pix(Conta dest, double valor){
        saldo -= valor;
        dest.saldo += valor;
    }



}
