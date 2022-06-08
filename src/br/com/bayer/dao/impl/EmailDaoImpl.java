package br.com.bayer.dao.impl;

import br.com.bayer.dao.EmailDao;
import br.com.bayer.entity.Email;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmailDaoImpl implements EmailDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Email email) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_EMAIL (id_email, tipo_email, email, t_pessoa_id_pessoa) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, email.getId());
            stt.setString(2, email.getTipoEmail());
            stt.setString(3, email.getEmail());
            stt.setLong(4, email.getIdPessoa());

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
