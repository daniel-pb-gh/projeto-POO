package com.POO.projeto.model;

import com.POO.projeto.annotation.Id;

public class Cliente {
    @Id
    private int id;
    private String nomeCompleto;
    private String endereco;
    private String email;

    public Cliente(String nomeCompleto, String endereco, String email) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nomeCompleto +
                ", endereço=" + endereco + ", email=" + email + "]";
    }
}
