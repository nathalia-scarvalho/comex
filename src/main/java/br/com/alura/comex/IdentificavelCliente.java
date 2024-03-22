package br.com.alura.comex;

// Implementação para Cliente
public class IdentificavelCliente implements Identificavel {
    private Cliente cliente;

    public IdentificavelCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String identificar() {
        return "Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf();
    }

}
