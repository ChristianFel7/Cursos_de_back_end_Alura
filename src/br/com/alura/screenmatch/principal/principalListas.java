package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class principalListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(3.5);
        Serie lost = new Serie("Lost", 2000);
        var filmeDoChris = new Filme("Nome", 2003);
        filmeDoChris.avalia(9);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(filmeDoChris);
        lista.add(outroFilme);
        lista.add(lost);

        lista.forEach(System.out::println);

        for( Titulo item: lista ){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println("Classificção: " + filme.getClassificacao());
            }
        }
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }




}
