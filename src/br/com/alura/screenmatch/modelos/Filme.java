package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificar;

public class Filme extends Titulo implements Classificar {
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String diretor;

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;
    }
}