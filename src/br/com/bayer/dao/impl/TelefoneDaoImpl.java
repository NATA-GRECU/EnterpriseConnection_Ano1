package br.com.bayer.dao.impl;

import br.com.bayer.dao.TelefoneDao;
import br.com.bayer.entity.Telefone;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelefoneDaoImpl implements TelefoneDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Telefone telefone) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_TELEFONE (id_tel, num_tel, ddd, ddi, t_pessoa_id_pessoa) " +
                    "VALUES (?, ?, ?, ?, ?)");

            stt.setLong(1, telefone.getId());
            stt.setString(2, telefone.getNumero());
            stt.setInt(3, telefone.getDdd());
            stt.setInt(4, telefone.getDdi());
            stt.setLong(5, telefone.getIdPessoa());

            stt.executeUpdate();

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
