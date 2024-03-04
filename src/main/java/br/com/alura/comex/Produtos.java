package br.com.alura.comex;

import java.util.Objects;

public class Produtos {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produtos(String nome, String descricao, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Produtos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return Double.compare(produtos.getPrecoUnitario(), getPrecoUnitario()) == 0 && getQuantidade() == produtos.getQuantidade() && Objects.equals(getNome(), produtos.getNome()) && Objects.equals(getDescricao(), produtos.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getPrecoUnitario(), getQuantidade());
    }



    public void printProduto() {
        System.out.println(">> Dados do produto");
        System.out.println(":: Nome: " + this.nome);
        System.out.println(":: Descrição: " + this.descricao);
    }

}


