public class Curso {
    //atributos
    String nome;
    Disciplina[] disciplina;

    //construtor
    Curso(String nome){
        this.nome = nome;
    }

    void mostraInfo(){
        System.out.println("Nome do Curso: " + nome);
        System.out.println("-------------------------------------------");
        for (int i = 0; i < disciplina.length; i++) {
            if (disciplina[i] != null){
                disciplina[i].mostraInfo();
            }
        }
    }

}
