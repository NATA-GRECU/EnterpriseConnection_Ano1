package br.com.bayer.dao.impl;

import br.com.bayer.dao.PesoDao;
import br.com.bayer.entity.Peso;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PesoDaoImpl implements PesoDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Peso peso) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_PESO (id_peso, peso, dt_peagem, t_pessoa_id_pessoa) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, peso.getId());
            stt.setDouble(2, peso.getPeso());
            stt.setDate(3, peso.getDtPesagem());
            stt.setLong(4, peso.getIdPessoa());

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
