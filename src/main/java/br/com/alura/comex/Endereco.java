package br.com.alura.comex;

import java.util.Objects;

public class Endereco {
    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private int numero;

    public Endereco(String bairro, String cidade, String complemento, String estado, String rua, int numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco(){}


    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;
        return getNumero() == endereco.getNumero() && Objects.equals(getBairro(), endereco.getBairro()) && Objects.equals(getCidade(), endereco.getCidade()) && Objects.equals(getComplemento(), endereco.getComplemento()) && Objects.equals(getEstado(), endereco.getEstado()) && Objects.equals(getRua(), endereco.getRua());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBairro(), getCidade(), getComplemento(), getEstado(), getRua(), getNumero());
    }
}



