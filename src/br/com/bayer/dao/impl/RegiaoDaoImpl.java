package br.com.bayer.dao.impl;

import br.com.bayer.dao.RegiaoDao;
import br.com.bayer.entity.Regiao;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegiaoDaoImpl implements RegiaoDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Regiao regiao) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_REGIAO (id_regiao, nm_regiao) " +
                    "VALUES (?, ?)");

            stt.setLong(1, regiao.getId());
            stt.setString(2, regiao.getNome());

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
