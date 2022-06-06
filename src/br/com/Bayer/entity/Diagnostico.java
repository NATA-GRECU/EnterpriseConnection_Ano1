package br.com.Bayer.entity;

import java.io.Serializable;
import java.util.Date;

public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String crm;
    private Date inicioSintomas;
    private String tratamento;
    private long idPessoa;
    private Date entrada;
    private Date retorno;

    public Diagnostico(long id, String crm, Date inicioSintomas, String tratamento, long idPessoa, Date entrada, Date retorno) {
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

    public Date getInicioSintomas() {
        return inicioSintomas;
    }

    public void setInicioSintomas(Date inicioSintomas) {
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

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }
}
