package br.com.Bayer.entity;

import java.io.Serializable;

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private long idEstado;

    public Cidade() {}

    public Cidade(long id, String nome, long idEstado) {
        this.id = id;
        this.nome = nome;
        this.idEstado = idEstado;
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

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }
}
