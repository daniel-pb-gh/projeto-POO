package com.POO.projeto.model;

import com.POO.projeto.annotation.Id;

public class Acomodacao {
    @Id
    Integer numeroDoQuarto;
    double preco;


    public Acomodacao(Integer numeroDoQuarto, double preco) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Acomodacao{" +
                "numeroDoQuarto=" + numeroDoQuarto +
                ", preco=" + preco +
                '}';
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setNumeroDoQuarto(int numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
