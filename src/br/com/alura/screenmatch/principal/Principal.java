package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalcularTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A pequena sereia", 2024);
        meuFilme.setDuracaoMinutos(160);
        System.out.println("a duração do filme é de " + meuFilme.getDuracaoMinutos() + " minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println("Total de avaliação: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.mediaAvaliacao());

        Serie ouat = new Serie("Once upon a time", 2013);
        ouat.setEpsodioTemporada(26);
        ouat.setTemporada(7);
        ouat.exibeFichaTecnica();

        ouat.setMinutoTemporada(48);
        System.out.println("Duração para maratonar Once upon a time: " + ouat.getDuracaoMinutos() + " minutos");

        Filme outroFilme = new Filme("Malévola", 2014);
        outroFilme.setDuracaoMinutos(140);

        CalcularTempo calculadora = new CalcularTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(ouat);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.getNumero();
        episodio.setSerie(ouat);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDaRob = new Filme("Barbie", 2024);
        filmeDaRob.setDuracaoMinutos(160);
        filmeDaRob.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista " + listaDeFilmes.size());
        System.out.println("primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}
