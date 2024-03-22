package br.com.alura.comex;

public class Livro extends Produtos {

    private String isbn;

    private int totalDePaginas;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public Livro(String nome, String descricao, double precoUnitario, int quantidade) {
        super(nome, descricao, precoUnitario, quantidade);
        this.isbn = isbn;
        this.totalDePaginas = totalDePaginas;
    }
}
