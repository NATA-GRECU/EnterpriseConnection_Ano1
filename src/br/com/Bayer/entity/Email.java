package br.com.Bayer.entity;

import java.io.Serializable;

public class Email implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String tipoEmail;
    private String email;
    private long idPessoa;

    public Email(long id, String tipoEmail, String email, long idPessoa) {
        this.id = id;
        this.tipoEmail = tipoEmail;
        this.email = email;
        this.idPessoa = idPessoa;
    }

    public Email(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(String tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
