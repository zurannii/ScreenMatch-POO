import br.com.alura.screenmatch.calculo.CalcularTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("A pequena sereia");
        meuFilme.setAnoLancamento(2024);
        meuFilme.setDuracaoMinutos(160);
        System.out.println("a duração do filme é de " + meuFilme.getDuracaoMinutos() + " minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println("Total de avaliação: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.mediaAvaliacao());

        Serie ouat = new Serie();
        ouat.setEpsodioTemporada(26);
        ouat.setTemporada(7);
        ouat.exibeFichaTecnica();
        ouat.setNome("Once upon a time");
        ouat.setMinutoTemporada(48);
        System.out.println("Duração para maratonar Once upon a time: " + ouat.getDuracaoMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Malévola");
        outroFilme.setAnoLancamento(2014);
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
    }
}
