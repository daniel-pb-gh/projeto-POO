package com.POO.projeto.service;

import com.POO.projeto.dao.AcomodacaoDao;
import com.POO.projeto.model.Acomodacao;
import com.POO.projeto.util.FabricaDeDaos;

import java.util.List;

public class AcomodacaoService {
    AcomodacaoDao acomodacaoDao = FabricaDeDaos.getDao(AcomodacaoDao.class);

    public Acomodacao cadastrar(Acomodacao acomodacao) {
        return acomodacaoDao.cadastrar(acomodacao);
    }

    public Acomodacao recuperar(Integer numero) {
        return acomodacaoDao.recuperar(numero);
    }

    public List<Acomodacao> recuperarTodos() {
        return acomodacaoDao.recuperarTodos();
    }

    public boolean vazio() {
        return acomodacaoDao.vazio();
    }
}
