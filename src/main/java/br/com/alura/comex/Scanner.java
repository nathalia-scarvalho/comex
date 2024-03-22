package br.com.alura.comex;

import java.util.InputMismatchException;

public class Scanner {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        java.util.Scanner leitura = new java.util.Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.println("Digite um número:");

        // Tenta ler o número digitado pelo usuário
        try {
            int numero = leitura.nextInt();
            System.out.println("Você digitou o número: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro.");
        } finally {
            // Fecha o objeto Scanner para liberar recursos
            leitura.close();
        }
    }

}


