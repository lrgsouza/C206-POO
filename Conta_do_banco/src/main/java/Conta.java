public class Conta {
    //o que a conta tem de dados
    String nome;
    double saldo;
    int agencia;
    int numero;
    String tipodeconta;


    Conta(String nome,double saldo, int agencia, int numero , String tipodeconta){
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.tipodeconta = tipodeconta;
        int i = 0;
        while (i<30){
            System.out.print("-");
            i++;
        }
        i = 0;
        System.out.print("\n");
        System.out.println("Conta - AG: " + this.agencia + " Número: " + this.numero + " registrada com sucesso!");
        while (i<30){
            System.out.print("-");
            i++;
        }
        System.out.print("\n");
    }

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
        System.out.println("Caro " + this.nome + ", Pix no valor de "  + valor + " realizado com sucesso para " + dest.nome);
    }



}
