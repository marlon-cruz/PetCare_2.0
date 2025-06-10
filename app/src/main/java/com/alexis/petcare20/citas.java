package com.alexis.petcare20;

import java.util.Date;

public class citas {
    String idCitas;
    String nombreMascota;
    String fecha;
    String clinica;
    String nota;
    String foto;
    String usuario;
    String llave;

/*    String foto;
    String miToken;*/

    public citas(String idCitas, String nombreMascota, String fecha, String clinica, String nota, String foto, String usuario,String llave) {
    //public citas(String idCitas, String nombreMascota, String fecha, String clinica, String nota, String foto, String miToken) {
        this.idCitas = idCitas;
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.clinica = clinica;
        this.nota = nota;
        this.foto = foto;
        this.usuario = usuario;
        this.llave = llave;

        //this.miToken = miToken;
    }


    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(String idCitas) {
        this.idCitas = idCitas;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getidCitas() {
        return idCitas;
    }

    public void setidCitas(String idCitas) {
        this.idCitas = idCitas;
    }

    public String getnombreMascota() {
        return nombreMascota;
    }

    public void setnombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String getclinica() {
        return clinica;
    }

    public void setclinica(String clinica) {
        this.clinica = clinica;
    }

    public String getnota() {
        return nota;
    }

    public void setnota(String nota) {
        this.nota = nota;
    }

    public String getusuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}