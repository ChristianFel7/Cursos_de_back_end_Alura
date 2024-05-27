package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExcecao extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoExcecao(String s) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
