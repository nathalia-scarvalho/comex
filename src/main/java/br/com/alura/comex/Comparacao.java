package br.com.alura.comex;

public class Comparacao {
    public static void main(String[] args) {
        Produtos produtoA = new Produtos("Liptint", "maravilhoso", 49.90, 2);
        Produtos produtoB = new Produtos("Computador", "gamer", 8.000, 2);
        Produtos produtoC = new Produtos("Liptint", "maravilhoso", 49.90, 2);

        if(produtoA.equals(produtoB)){

            System.out.println("Produto A é igual ao Produto B");

        } else {

            System.out.println("Produto A não é igual ao Produto B");
        }

        if(produtoA.equals(produtoC)){

            System.out.println("Produto A é igual ao Produto C");

        } else {
            System.out.println("Produto A não é igual ao Produto C");
        }

        produtoA.printProduto();
        produtoB.printProduto();
        produtoC.printProduto();


        ListaDeDesejos listaDeDesejos = new ListaDeDesejos();
        listaDeDesejos.adicionaProduto(produtoA);
        listaDeDesejos.adicionaProduto(produtoB);
        listaDeDesejos.imprimeProduto();
    }
}
