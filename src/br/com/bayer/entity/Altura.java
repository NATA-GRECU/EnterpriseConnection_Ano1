package br.com.bayer.entity;

import java.io.Serializable;

public class Altura implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private double altura;
    private java.sql.Date dtMedicao;
    private long idPessoa;

    public Altura(long id, double altura, java.sql.Date dtMedicao, long idPessoa) {
        this.id = id;
        this.altura = altura;
        this.dtMedicao = dtMedicao;
        this.idPessoa = idPessoa;
    }

    public Altura(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public java.sql.Date getDtMedicao() {
        return dtMedicao;
    }

    public void setDtMedicao(java.sql.Date dtMedicao) {
        this.dtMedicao = dtMedicao;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
