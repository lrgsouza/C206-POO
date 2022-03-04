public class Aluno {
    int matricula;
    String nome;
    int idade;

    Aluno(int matricula, String nome, int idade){
        this.matricula = matricula;
        this.nome = nome;
        this. idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

}
