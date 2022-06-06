package br.com.Bayer.entity;

import java.io.Serializable;

public class Regiao implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;

    public Regiao(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Regiao(){}

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
}
