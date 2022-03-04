public class Principal {
    public static void main(String[] args) {

        //declarando arrays
        Curso[] cursos = new Curso[3];
        Disciplina[] disciplinas = new Disciplina[3];
        Aluno[] alunos = new Aluno[3];

        //cursos
        cursos[0] = new Curso("GES");
        cursos[1] = new Curso("GET");
        cursos[2] = new Curso("GEA");

        //disciplinas
        disciplinas[0] = new Disciplina("C205","Renzo");
        disciplinas[1] = new Disciplina("C206","Phyllipe");
        disciplinas[2] = new Disciplina("C207","Fabio");

        //alunos batch 0
        alunos[0] = new Aluno(134,"Lucas",30);
        alunos[1] = new Aluno(135,"Joao",25);
        alunos[2] = new Aluno(136,"Pedro",19);

        //apontando arrays
        cursos[0].disciplina = disciplinas;
        cursos[1].disciplina = disciplinas;
        cursos[2].disciplina = disciplinas;
        disciplinas[0].aluno = alunos;
        disciplinas[1].aluno = alunos;
        disciplinas[2].aluno = alunos;

        //mostrando info
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("-------------------------------------------");
            if(cursos[i] != null){
                cursos[i].mostraInfo();
            }
            System.out.println("-------------------------------------------");
        }
    }
}
