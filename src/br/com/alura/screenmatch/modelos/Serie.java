package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int minutosPorEpisodios;
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {

        return temporadas * episodiosPorTemporada * minutosPorEpisodios;
    }
}
