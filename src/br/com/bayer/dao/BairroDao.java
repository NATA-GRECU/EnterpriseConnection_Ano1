package br.com.bayer.dao;

import br.com.bayer.entity.Bairro;
import br.com.bayer.entity.Cidade;

public interface BairroDao {

    void insert(Bairro bairro);

    interface CidadeDao {

        void insert(Cidade cidade);
    }
}
