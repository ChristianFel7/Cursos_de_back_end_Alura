package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println("Digite um CEP para busca: ");
        var busca = leitura.nextLine();

        while (busca.length() != 8) {
            System.out.println("CEP inválido. Informe novamente: ");
            busca = leitura.nextLine();
        }
        String endereco = "https://viacep.com.br/ws/" + busca + "/json/";



        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            System.out.println(json);


             var x = gson.fromJson(json, Endereco.class);


            FileWriter escrita = new FileWriter("cep.json");
            escrita.write(gson.toJson(json));
            escrita.close();


        }catch (NumberFormatException e) {
            System.out.println("Erro na execução do sistema: ");
            System.out.println(e.getMessage());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("CEP não encontrado.");
        }
    }





}
