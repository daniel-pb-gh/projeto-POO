package com.POO.projeto.dao;

import com.POO.projeto.model.Produto;

import java.util.List;

public interface ProdutoDao extends DaoGenerico<Produto> {
    List<Produto> recuperarProdutosOrdenadosPorNome();
    List<Produto> recuperarProdutosOrdenadosDescendentementePorNome();
}
