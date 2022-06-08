package br.com.bayer.dao.impl;

import br.com.bayer.dao.CidadeDao;
import br.com.bayer.entity.Cidade;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CidadeDaoImpl implements CidadeDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Cidade cidade) {

        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_CIDADE (id_cidade, nm_cidade, t_estado_id_estado) " +
                    "VALUES (?, ?, ?)");

            stt.setLong(1, cidade.getId());
            stt.setString(2, cidade.getNome());
            stt.setLong(3, cidade.getIdEstado());

            stt.executeUpdate();

            System.out.println("Cidade cadastrada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
