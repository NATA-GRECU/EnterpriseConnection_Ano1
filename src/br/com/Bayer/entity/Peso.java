package br.com.Bayer.entity;

import java.io.Serializable;
import java.util.Date;

public class Peso implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private double peso;
    private Date dtPesagem;
    private long idPessoa;

    public Peso(long id, double peso, Date dtPesagem, long idPessoa) {
        this.id = id;
        this.peso = peso;
        this.dtPesagem = dtPesagem;
        this.idPessoa = idPessoa;
    }

    public Peso(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getDtPesagem() {
        return dtPesagem;
    }

    public void setDtPesagem(Date dtPesagem) {
        this.dtPesagem = dtPesagem;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
