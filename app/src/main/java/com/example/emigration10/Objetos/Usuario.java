package com.example.emigration10.Objetos;

public class Usuario {

    private String nombreUsuario, idUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String idUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
