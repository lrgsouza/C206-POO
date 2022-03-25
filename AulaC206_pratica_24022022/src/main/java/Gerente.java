public class Gerente extends Funcionario{
    //usando extends a classe Gerente herda tudo do funcionario

    //atributos exclusivos do gerente
    private String senhaAcesso;
    private double bonus;

    public Gerente(String nome, int horasTrabalhando, double salarioHora, int matricula){
        super(nome, horasTrabalhando, salarioHora, matricula);
    }

    //calcula salario exclusivo do gerente
    @Override
    public double calculoSalarioMes() {
        double totalSalario = super.calculoSalarioMes();
        totalSalario += bonus;
        return totalSalario;
    }

}
