package br.cdg.inatel.model;

public class TemporadaException extends Exception{
    public void nTempordasIncorreta(){
        System.out.println("Só aceita séries com 1 ou mais temporadas");
    }
}
