package br.com.bayer.entity;

import java.io.Serializable;

public class Rua implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private String cep;
    private long idBairro;

    public Rua(long id, String nome, String cep, long idBairro) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.idBairro = idBairro;
    }

    public Rua(){}

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(long idBairro) {
        this.idBairro = idBairro;
    }
}
