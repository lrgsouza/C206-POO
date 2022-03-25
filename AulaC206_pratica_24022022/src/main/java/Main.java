public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Lucas",176,11.5,134);
        Estagiario e1 = new Estagiario("Airton",120,8.5,113);

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = g1;
        funcionarios[1] = e1;

        for (Funcionario funcionario:funcionarios) {
            if (funcionario instanceof Gerente){
                Gerente gerente = (Gerente) funcionario;
                gerente.apresentar();
                System.out.println("Salario: " + gerente.calculoSalarioMes());
            }
            if (funcionario instanceof Estagiario){
                Estagiario estagiario = (Estagiario) funcionario;
                estagiario.apresentar();
                estagiario.fazCafe();
                System.out.println("Salário: "+estagiario.calculoSalarioMes());
            }

        }

    }
}
