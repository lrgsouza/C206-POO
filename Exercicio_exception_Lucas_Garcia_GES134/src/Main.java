import br.cdg.inatel.exceptions.NomeRepetidoException;
import br.cdg.inatel.exceptions.NotaInvalidaException;

public class Main {
    public static void main(String[] args) {

        Fetin projetos = new Fetin();

        //adicionando projetos
        try {
            projetos.addProjeto("Can Crusher", 8d);
        }catch (NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try {
            projetos.addProjeto("Can Crusher", 5.6d);
        }catch (NomeRepetidoException e){
            System.out.println(e.getMessage());
        }
        try {
            projetos.addProjeto("Car Parker",4d);
        }catch (NomeRepetidoException e){
            System.out.println(e.getMessage());
        }

        //veriricando nota
        try {
            projetos.verifyNota("Can Crusher");
        }catch (NotaInvalidaException e){
            System.out.println(e.getMessage());
        }

        try {
            projetos.verifyNota("Car Parker");
        }catch (NotaInvalidaException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }
}
