package br.com.alura.comex;

// Implementação para Livro
public class IdentificavelLivro implements Identificavel {
    private Livro livro;

    public IdentificavelLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String identificar() {
        return "Nome: " + livro.getNome() + ", ISBN: " + livro.getIsbn();
    }
}
