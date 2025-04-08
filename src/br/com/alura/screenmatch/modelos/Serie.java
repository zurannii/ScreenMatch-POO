package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int epsodioTemporada;
    private int minutoTemporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodioTemporada() {
        return epsodioTemporada;
    }

    public void setEpsodioTemporada(int epsodioTemporada) {
        this.epsodioTemporada = epsodioTemporada;
    }

    public int getMinutoTemporada() {
        return minutoTemporada;
    }

    public void setMinutoTemporada(int minutoTemporada) {
        this.minutoTemporada = minutoTemporada;
    }
    @Override
    public int getDuracaoMinutos(){
        return temporada * epsodioTemporada * minutoTemporada;
    }
}
