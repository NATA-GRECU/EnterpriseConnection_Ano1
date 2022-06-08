package br.com.bayer.dao.impl;

import br.com.bayer.dao.AlturaDao;
import br.com.bayer.entity.Altura;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlturaDaoImpl implements AlturaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Altura altura) {

        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_ALTURA (id_altura, altura, dt_medicao, t_pessoa_id_pessoa) " +
                    "VALUES (?, ?, ?, ?)");

            stt.setLong(1, altura.getId());
            stt.setDouble(2, altura.getAltura());
            stt.setDate(3, altura.getDtMedicao());
            stt.setLong(4, altura.getIdPessoa());

            stt.executeUpdate();

            System.out.println("Altura cadastrada com sucesso!");

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
