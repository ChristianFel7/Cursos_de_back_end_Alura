package br.com.alura.screenmatch.calculos;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento");
        }else {
            System.out.println("Lixo total");
        }

    }
}
