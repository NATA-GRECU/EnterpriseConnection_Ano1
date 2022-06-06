package br.com.Bayer.entity;

import java.io.Serializable;
import java.util.Date;

public class Altura implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private double altura;
    private Date dtMedicao;
    private long idPessoa;

    public Altura(long id, double altura, Date dtMedicao, long idPessoa) {
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

    public Date getDtMedicao() {
        return dtMedicao;
    }

    public void setDtMedicao(Date dtMedicao) {
        this.dtMedicao = dtMedicao;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
