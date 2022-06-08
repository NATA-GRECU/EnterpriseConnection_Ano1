package br.com.bayer.dao.impl;

import br.com.bayer.dao.DoencaDao;
import br.com.bayer.entity.Doenca;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoencaDaoImpl implements DoencaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Doenca doenca) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_DOENCA (cid_doenca, nome, sintomas, t_pessoa_id_pessoa) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, doenca.getId());
            stt.setString(2, doenca.getNome());
            stt.setString(3, doenca.getSintomas());
            stt.setLong(4, doenca.getIdPessoa());

            stt.executeUpdate();

            System.out.println("Doenca cadastrada com sucesso!");

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
