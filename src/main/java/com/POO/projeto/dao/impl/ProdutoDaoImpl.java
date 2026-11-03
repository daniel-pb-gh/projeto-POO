package com.POO.projeto.dao.impl;

import com.POO.projeto.dao.ProdutoDao;
import com.POO.projeto.model.Produto;

import java.util.Comparator;
import java.util.List;

public class ProdutoDaoImpl extends DaoGenericoImpl<Produto> implements ProdutoDao {

    @Override
    public List<Produto> recuperarProdutosOrdenadosPorNome() {
        return map.values()
                  .stream()
                  // .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                  // .sorted(new ComparadorDeProdutosPorNome())
                  .sorted(Comparator.comparing(Produto::getNome))
                  .toList();
    }

    @Override
    public List<Produto> recuperarProdutosOrdenadosDescendentementePorNome() {
        return map.values()
            .stream()
            // .sorted((p1, p2) -> p2.getNome().compareTo(p1.getNome()))
            // .sorted(new ComparadorDeProdutosPorNome().reversed())
            .sorted(Comparator.comparing(Produto::getNome).reversed())
            .toList();
    }
}
