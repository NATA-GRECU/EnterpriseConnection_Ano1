package br.com.Bayer.entity;

import java.io.Serializable;

public class Bairro implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String nome;
    private long idCidade;
    private long idBairro;

    public Bairro(long id, String nome, long idCidade, long idBairro) {
        this.id = id;
        this.nome = nome;
        this.idCidade = idCidade;
        this.idBairro = idBairro;
    }

    public Bairro(){

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

    public long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(long idCidade) {
        this.idCidade = idCidade;
    }

    public long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(long idBairro) {
        this.idBairro = idBairro;
    }
}
