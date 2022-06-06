package br.com.Bayer.entity;

import java.io.Serializable;

public class Residencia implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private int numero;
    private String pontoReferencia;
    private long idRua;

    public Residencia(long id, int numero, String pontoReferencia, long idRua) {
        this.id = id;
        this.numero = numero;
        this.pontoReferencia = pontoReferencia;
        this.idRua = idRua;
    }

    public Residencia(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public long getIdRua() {
        return idRua;
    }

    public void setIdRua(long idRua) {
        this.idRua = idRua;
    }
}
