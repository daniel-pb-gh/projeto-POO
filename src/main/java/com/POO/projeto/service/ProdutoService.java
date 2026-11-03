package com.POO.projeto.service;

import com.POO.projeto.dao.ProdutoDao;
import com.POO.projeto.model.Produto;
import com.POO.projeto.util.FabricaDeDaos;

import java.util.List;

public class ProdutoService {
    ProdutoDao produtoDao = FabricaDeDaos.getDao(ProdutoDao.class);

    public Produto cadastrar(Produto produto) {
        return produtoDao.cadastrar(produto);
    }

    public Produto remover(Integer numero) {
        return produtoDao.remover(numero);
    }

    public Produto recuperar(Integer numero) {
        return produtoDao.recuperar(numero);
    }

    public List<Produto> recuperarTodos() {
        return produtoDao.recuperarTodos();
    }

    public boolean vazio() {
        return produtoDao.vazio();
    }

    public List<Produto> recuperarProdutosOrdenadosPorNome() {
        return produtoDao.recuperarProdutosOrdenadosPorNome();
    }

    public List<Produto> recuperarProdutosOrdenadosDescendentementePorNome() {
        return produtoDao.recuperarProdutosOrdenadosDescendentementePorNome();
    }
}
