package br.com.Bayer.entity;

import java.io.Serializable;

public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String numero;
    private int ddd;
    private int ddi;
    private long idPessoa;

    public Telefone(long id, String numero, int ddd, int ddi, long idPessoa) {
        this.id = id;
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
        this.idPessoa = idPessoa;
    }

    public Telefone() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
