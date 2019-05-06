package com.example.emigration10.Objetos;

public class Equipo {

    private String idEquipoAntiguo, idEquipoNuevo;

    public Equipo() {
    }

    public Equipo(String idEquipoAntiguo, String idEquipoNuevo) {
        this.idEquipoAntiguo = idEquipoAntiguo;
        this.idEquipoNuevo = idEquipoNuevo;
    }

    public String getIdEquipoNuevo() {
        return idEquipoNuevo;
    }

    public void setIdEquipoNuevo(String idEquipoNuevo) {
        this.idEquipoNuevo = idEquipoNuevo;
    }

    public String getIdEquipoAntiguo() {
        return idEquipoAntiguo;
    }

    public void setIdEquipoAntiguo(String idEquipoAntiguo) {
        this.idEquipoAntiguo = idEquipoAntiguo;
    }
}
