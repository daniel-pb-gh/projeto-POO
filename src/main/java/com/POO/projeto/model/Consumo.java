package com.POO.projeto.model;

import java.time.ZonedDateTime;

public class Consumo {
    Produto produto;
    Integer quantidade;
    ZonedDateTime dataHora;

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public ZonedDateTime getDataHora() {
        return dataHora;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataHora(ZonedDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
