public class Funcionario {
    //protected habilita os filhos da classe a acessarem
    //private deixa somente a classe acessar, para acessar por fora usar get/set
    protected String nome;
    protected int horasTrabalhando;
    protected double salarioHora;
    protected int matricula;

    public Funcionario(String nome, int horasTrabalhando, double salarioHora, int matricula) {
        this.nome = nome;
        this.horasTrabalhando = horasTrabalhando;
        this.salarioHora = salarioHora;
        this.matricula = matricula;
    }

    public double calculoSalarioMes(){
        return horasTrabalhando * salarioHora;
    }

    public void apresentar(){
        System.out.println("meu nome é " + nome);

    }


}
