package com.POO.projeto.model;

public class Cliente {
    String nomeCompleto;
    String endereco;
    String email;



    public Cliente(String nomeCompleto, String endereco, String email) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.email = email;
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
}