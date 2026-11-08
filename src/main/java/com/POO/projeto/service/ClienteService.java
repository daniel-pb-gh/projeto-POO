package com.POO.projeto.service;

import com.POO.projeto.dao.ClienteDao;
import com.POO.projeto.model.Cliente;
import com.POO.projeto.util.FabricaDeDaos;

import java.util.List;

public class ClienteService {
    ClienteDao clienteDao = FabricaDeDaos.getDao(ClienteDao.class);

    // Retorna null se já existir um cliente com o mesmo e-mail
    public Cliente cadastrar(Cliente cliente) {
        if (clienteDao.recuperarClientePorEmail(cliente.getEmail()) != null) {
            return null;
        }
        return clienteDao.cadastrar(cliente);
    }

    public Cliente remover(Integer numero) {
        return clienteDao.remover(numero);
    }

    public Cliente recuperar(Integer numero) {
        return clienteDao.recuperar(numero);
    }

    public List<Cliente> recuperarTodos() {
        return clienteDao.recuperarTodos();
    }

    public boolean vazio() {
        return clienteDao.vazio();
    }

    public List<Cliente> recuperarClientesOrdenadosPorNome() {
        return clienteDao.recuperarClientesOrdenadosPorNome();
    }

    public Cliente recuperarClientePorEmail(String email) {
        return clienteDao.recuperarClientePorEmail(email);
    }
}