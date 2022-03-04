public class Disciplina {

    String sigla;
    String professorResponsavel;
    Aluno[] aluno;

    Disciplina(String sigla, String professorResponsavel){
        this.sigla = sigla;
        this.professorResponsavel = professorResponsavel;
    }

    void mostraInfo(){
        System.out.println("Sigla: " + sigla);
        System.out.println("Professor responsável: " + professorResponsavel);

        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null){
                System.out.println(aluno[i].toString());
            }

        }
    }

}
