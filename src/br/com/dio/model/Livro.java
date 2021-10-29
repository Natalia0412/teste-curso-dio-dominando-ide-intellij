package br.com.dio.model;

public class Livro {
    private String nome;
    private Integer numeroPagina;

    public Livro(){}
    public Livro(String nome, Integer numeroPagina) {
        this.nome = nome;
        this.numeroPagina = numeroPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPagina=" + numeroPagina +
                '}';
    }
}
