import br.cdg.inatel.exceptions.NomeRepetidoException;
import br.cdg.inatel.exceptions.NotaInvalidaException;

import java.util.HashMap;

public class Fetin {
    private String nomeProjeto;
    private Double nota;
    HashMap<String,Double> FetinMap = new HashMap<>();


    public void addProjeto(String nome, Double nota){

        if (FetinMap.get(nome) == null){
            FetinMap.put(nome,nota);
        }else{
            throw new NomeRepetidoException("O nome "+nome+" Já foi utilizado!");
        }

    }

    public void verifyNota(String nomeProjeto) throws NotaInvalidaException {

        if (FetinMap.get(nomeProjeto) > 6){
            System.out.println(nomeProjeto+" APROVADO!");
        }else{
            throw new NotaInvalidaException(nomeProjeto+" Nota insuficiente!");
        }

    }


}
