package com.POO.projeto.dao.impl;

import com.POO.projeto.dao.ClienteDao;
import com.POO.projeto.model.Cliente;

import java.util.Comparator;
import java.util.List;

public class ClienteDaoImpl extends DaoGenericoImpl<Cliente> implements ClienteDao {

    @Override
    public List<Cliente> recuperarClientesOrdenadosPorNome() {
        return map.values()
                .stream()
                .sorted(Comparator.comparing(Cliente::getNomeCompleto))
                .toList();
    }

    @Override
    public Cliente recuperarClientePorEmail(String email) {
        return map.values()
                .stream()
                .filter(c -> c.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElse(null);
    }
}
