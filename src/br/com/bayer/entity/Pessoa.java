package br.com.bayer.entity;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private java.sql.Date dtNascimento;
    private String genero;
    private int idade;
    private String cpf;
    private String rg;
    private long idResidencia;

    public Pessoa(long id, String nome, java.sql.Date dtNascimento, String genero, int idade, String cpf, String rg, long idResidencia) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.idResidencia = idResidencia;
    }

    public Pessoa(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.sql.Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(java.sql.Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public long getIdResidencia() {
        return idResidencia;
    }

    public void setIdResidencia(long idResidencia) {
        this.idResidencia = idResidencia;
    }
}
