package br.cdg.inatel.model;

import br.cdg.inatel.control.Arquivo;
import br.cdg.inatel.Main;

public class Seriado implements Comparable<Seriado>{
    private String nome;
    private String streaming;
    private int temporadas;
    private int anoCriacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    public void setTemporadas(int temporadas) {
        try {
            if (temporadas < 1) {
                throw new TemporadaException();
            } else {
                this.temporadas = temporadas;
            }
        }catch (TemporadaException e){
            e.nTempordasIncorreta();
        }
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getNome() {
        return nome;
    }

    public String getStreaming() {
        return streaming;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    @Override
    public int compareTo(Seriado o) {

        return Integer.compare(this.anoCriacao,o.anoCriacao);
    }
}
