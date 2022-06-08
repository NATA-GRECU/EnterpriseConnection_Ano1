package br.com.bayer.dao.impl;

import br.com.bayer.dao.ResidenciaDao;
import br.com.bayer.entity.Residencia;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResidenciaDaoImpl implements ResidenciaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Residencia residencia) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_RESIDENCIA (id_residencia, num_residencia, ponto_referencia, t_rua_id_rua) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, residencia.getId());
            stt.setInt(2, residencia.getNumero());
            stt.setString(3, residencia.getPontoReferencia());
            stt.setLong(4, residencia.getIdRua());

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
