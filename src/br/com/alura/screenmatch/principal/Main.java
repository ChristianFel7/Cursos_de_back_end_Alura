package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia( 10);
        meuFilme.avalia( 5);

        meuFilme.setDuracaoEmMinutos(180);
        outroFilme.setDuracaoEmMinutos(200);


        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        System.out.println(meuFilme.pegaMedia());
        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(101);
        filtro.filtra(episodio);

        var filmeDoChris = new Filme("Nome", 2003);
        filmeDoChris.setDuracaoEmMinutos(200);
        //filmeDoChris.setNome("Dogville");
        //filmeDoChris.setAnoDeLancamento(2003);
        filmeDoChris.avalia(10);

        ArrayList<Filme> listadeFilmes = new ArrayList<>();
        listadeFilmes.add(meuFilme);
        listadeFilmes.add(filmeDoChris);
        listadeFilmes.add(outroFilme);

        System.out.println(listadeFilmes);
    }
}