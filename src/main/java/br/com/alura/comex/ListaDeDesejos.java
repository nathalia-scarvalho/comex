package br.com.alura.comex;

import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<Produtos> produtos;

    public ListaDeDesejos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionaProduto(Produtos produto){
        this.produtos.add(produto);
    }

    public void imprimeProduto(){
        for (Produtos produto: this.produtos) {
            produto.printProduto();
        }


    }
}
