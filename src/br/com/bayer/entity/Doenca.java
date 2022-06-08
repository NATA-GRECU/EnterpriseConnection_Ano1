package br.com.bayer.entity;

import java.io.Serializable;

public class Doenca implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private String sintomas;
    private long idPessoa;

    public Doenca(long id, String nome, String sintomas, long idPessoa) {
        this.id = id;
        this.nome = nome;
        this.sintomas = sintomas;
        this.idPessoa = idPessoa;
    }

    public Doenca() {
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
