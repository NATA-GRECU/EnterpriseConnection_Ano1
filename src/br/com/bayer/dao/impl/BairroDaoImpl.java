package br.com.bayer.dao.impl;

import br.com.bayer.dao.BairroDao;
import br.com.bayer.entity.Bairro;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BairroDaoImpl implements BairroDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Bairro bairro) {

        try {
            conexao = ConnectionManager.getInstance().getConnetion();
            stt = conexao.prepareStatement("INSERT INTO T_BAIRRO (id_bairro, nm_bairro, t_cidade_id_cidade, " +
                    "t_bairro_id) VALUES (?, ?, ?, ?)");

            stt.setLong(1, bairro.getId());
            stt.setString(2, bairro.getNome());
            stt.setLong(3, bairro.getIdCidade());
            stt.setLong(4, bairro.getIdBairro());

            stt.executeUpdate();

            System.out.println("Bairro cadastrado com sucesso!");

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
