package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificar;

public class Episodio implements Classificar {
    private int numero;
    private String nome;
    private Serie serie;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    private int totalVisualizacao;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao >= 100) {
        return 4;
        } else {
            return 2;
        }
    }
}


