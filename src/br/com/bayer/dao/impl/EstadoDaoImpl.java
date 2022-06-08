package br.com.bayer.dao.impl;

import br.com.bayer.dao.EstadoDao;
import br.com.bayer.entity.Estado;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstadoDaoImpl implements EstadoDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Estado estado) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_ESTADO (id_estado, nm_estado, uf,t_regiao_id_regiao) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, estado.getId());
            stt.setString(2, estado.getNome());
            stt.setString(3, estado.getUf());
            stt.setLong(4, estado.getIdRegiao());

            stt.executeUpdate();

            System.out.println("Estado cadastrado com sucesso!");

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
