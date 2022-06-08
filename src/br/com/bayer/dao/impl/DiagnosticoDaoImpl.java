package br.com.bayer.dao.impl;

import br.com.bayer.dao.DiagnosticoDao;
import br.com.bayer.entity.Diagnostico;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DiagnosticoDaoImpl implements DiagnosticoDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Diagnostico diagnostico) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_DIAGNOSTICO (id_diagnostico, crm, inicio_sintomas, tratamento," +
                    "t_pessoa_id_pessoa, dt_entrada, dt_retorno) VALUES (?, ?, ?, ?, ?, ?, ?)");

            stt.setLong(1, diagnostico.getId());
            stt.setString(2, diagnostico.getCrm());
            stt.setDate(3, diagnostico.getInicioSintomas());
            stt.setString(4, diagnostico.getTratamento());
            stt.setLong(5, diagnostico.getIdPessoa());
            stt.setDate(6, diagnostico.getEntrada());
            stt.setDate(7, diagnostico.getRetorno());

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
