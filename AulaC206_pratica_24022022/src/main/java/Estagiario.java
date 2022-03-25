public class Estagiario extends Funcionario{


    public Estagiario(String nome, int horasTrabalhando, double salarioHora, int matricula){
        super(nome, horasTrabalhando, salarioHora, matricula);
    }

    public void fazCafe(){
        System.out.println("café feito");
    }

}
