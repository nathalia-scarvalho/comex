package br.com.alura.comex;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, String profissao, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getCpf(), cliente.getCpf()) && Objects.equals(getEmail(), cliente.getEmail()) && Objects.equals(getProfissao(), cliente.getProfissao()) && Objects.equals(getTelefone(), cliente.getTelefone()) && Objects.equals(getEndereco(), cliente.getEndereco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getEmail(), getProfissao(), getTelefone(), getEndereco());
    }
}

