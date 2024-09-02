/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

public class Censo {
    private Persona persona;
    private Direccion direccion;
    private Date fechaRegistro;

    public Censo(Persona persona, Direccion direccion, Date fechaRegistro) {
        this.persona = persona;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    public Persona getPersona() {
        return persona;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }
}
