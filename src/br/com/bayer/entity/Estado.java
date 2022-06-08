package br.com.bayer.entity;

import java.io.Serializable;

public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private String uf;
    private long idRegiao;

    public Estado(long id, String nome, String uf, long idRegiao) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.idRegiao = idRegiao;
    }

    public Estado() {
    }

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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public long getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(long idRegiao) {
        this.idRegiao = idRegiao;
    }
}
