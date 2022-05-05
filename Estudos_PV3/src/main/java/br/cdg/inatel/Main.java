package br.cdg.inatel;

import br.cdg.inatel.model.Seriado;
import br.cdg.inatel.control.Arquivo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Seriado seriado = new Seriado();
        Arquivo arquivo = new Arquivo();

        //criando seriados
        seriado.setNome("The Call");
        seriado.setStreaming("Netflix");
        seriado.setAnoCriacao(2002);
        seriado.setTemporadas(5);
        //escrevendo no arquivo
        arquivo.escrever(seriado);
        //++
        seriado.setNome("The office");
        seriado.setStreaming("HBO plus");
        seriado.setAnoCriacao(1998);
        seriado.setTemporadas(1);
        //escrevendo no arquivo
        arquivo.escrever(seriado);

        //lendo arquivo
        ArrayList<Seriado> seriados = new ArrayList<Seriado>();
        seriados = arquivo.ler();

        //ordenando crescente
        Collections.sort(seriados);

        for (Seriado s:
                seriados) {
            System.out.println("Nome:"+s.getNome());
            System.out.println("Streaming:"+s.getStreaming());
            System.out.println("Ano de Lançamento:"+s.getAnoCriacao());
            System.out.println("Numero de temporadas:"+s.getTemporadas());
        }

        //ordenando decrescente
        System.out.println("=====================================================");
        Collections.reverse(seriados);

        for (Seriado s:
                seriados) {
            System.out.println("Nome:"+s.getNome());
            System.out.println("Streaming:"+s.getStreaming());
            System.out.println("Ano de Lançamento:"+s.getAnoCriacao());
            System.out.println("Numero de temporadas:"+s.getTemporadas());
        }


    }
}
