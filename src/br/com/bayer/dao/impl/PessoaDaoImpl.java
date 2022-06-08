package br.com.bayer.dao.impl;

import br.com.bayer.dao.PessoaDao;
import br.com.bayer.entity.Pessoa;
import br.com.bayer.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDaoImpl implements PessoaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Pessoa pessoa) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();

            stt = conexao.prepareStatement("INSERT INTO T_PESSOA (id_pessoa, nome, dt_nasc, genero, idade, cpf, rg," +
                    "t_residencia_id_residencia) VALUES (?, ?, ?, ?, ?, ?, ? ,?)");

            stt.setLong(1, pessoa.getId());
            stt.setString(2, pessoa.getNome());
            stt.setDate(3, pessoa.getDtNascimento());
            stt.setString(4, pessoa.getGenero());
            stt.setInt(5, pessoa.getIdade());
            stt.setString(6, pessoa.getCpf());
            stt.setString(7, pessoa.getRg());
            stt.setLong(8, pessoa.getIdResidencia());

            stt.executeUpdate();

            System.out.println("Pessoa cadastrada com sucesso!");

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
