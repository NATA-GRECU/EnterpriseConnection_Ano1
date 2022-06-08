package br.com.bayer.dao.impl;

import br.com.bayer.dao.RuaDao;
import br.com.bayer.entity.Rua;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RuaDaoImpl implements RuaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Rua rua) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_RUA (id_rua, nm_rua, cep, t_bairro_t_bairro_id) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, rua.getId());
            stt.setString(2, rua.getNome());
            stt.setString(3, rua.getCep());
            stt.setLong(4, rua.getIdBairro());

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
