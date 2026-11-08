package com.POO.projeto.dao;

import com.POO.projeto.model.Cliente;

import java.util.List;

public interface ClienteDao extends DaoGenerico<Cliente> {
    List<Cliente> recuperarClientesOrdenadosPorNome();
    Cliente recuperarClientePorEmail(String email);
}