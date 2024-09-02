/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String lugarNacimiento;
    private int edad;
    private double estatura;
    private String sexo;
    private String nivelEstudios;
    private String situacionMilitar;  // Solo para hombres
    private String dni;               // Solo para mayores de 16

    public Persona(String nombre, String apellidos, Date fechaNacimiento, String lugarNacimiento, int edad, double estatura, String sexo, String nivelEstudios, String situacionMilitar, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.nivelEstudios = nivelEstudios;
        this.situacionMilitar = situacionMilitar;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public String getSituacionMilitar() {
        return situacionMilitar;
    }

    public String getDni() {
        return dni;
    }
}
