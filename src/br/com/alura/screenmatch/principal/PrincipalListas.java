package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    private static Filme outroFilme;

    public static void main(String[] args) {
        Filme meuFilme = new Filme("A pequena sereia", 2024);
        meuFilme.avalia(10);
        var filmeDaRob = new Filme("Barbie", 2024);
        filmeDaRob.avalia(8);
        Serie ouat = new Serie("Lost", 2013);
        ouat.avalia(10);
        outroFilme = new Filme("Hotel Transilvânia", 2012);
        outroFilme.avalia(9);


        ArrayList<Titulo> ListaAssistidos = new ArrayList<>();
        ListaAssistidos.add(meuFilme);
        ListaAssistidos.add(outroFilme);
       for (Titulo titulo : ListaAssistidos) {
           System.out.println(titulo.getNome());
           if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
               System.out.println("Classificação: " + filme.getClassificacao());
           }
       }

       ArrayList<String> buscarArtista = new ArrayList<>();
       buscarArtista.add("Mavis");
       buscarArtista.add("Addam Sandler");

       Collections.sort(buscarArtista);
        System.out.println("depois da ordenação:");
        System.out.println(buscarArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(ListaAssistidos);
        System.out.println(ListaAssistidos);
        ListaAssistidos.sort(Comparator.comparing(Titulo::getAnoLancamento));
    }
}
