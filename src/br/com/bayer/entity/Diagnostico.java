package br.com.bayer.entity;

import java.io.Serializable;
import java.util.Date;

public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String crm;
    private java.sql.Date inicioSintomas;
    private String tratamento;
    private long idPessoa;
    private java.sql.Date entrada;
    private java.sql.Date retorno;

    public Diagnostico(long id, String crm, java.sql.Date inicioSintomas, String tratamento, long idPessoa, java.sql.Date entrada, java.sql.Date retorno) {
        this.id = id;
        this.crm = crm;
        this.inicioSintomas = inicioSintomas;
        this.tratamento = tratamento;
        this.idPessoa = idPessoa;
        this.entrada = entrada;
        this.retorno = retorno;
    }

    public Diagnostico() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public java.sql.Date getInicioSintomas() {
        return inicioSintomas;
    }

    public void setInicioSintomas(java.sql.Date inicioSintomas) {
        this.inicioSintomas = inicioSintomas;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public java.sql.Date getEntrada() {
        return entrada;
    }

    public void setEntrada(java.sql.Date entrada) {
        this.entrada = entrada;
    }

    public java.sql.Date getRetorno() {
        return retorno;
    }

    public void setRetorno(java.sql.Date retorno) {
        this.retorno = retorno;
    }
}
