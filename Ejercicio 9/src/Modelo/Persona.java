/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jerem
 */
public class Persona {
    private String nombre;
    private String apellidos;
      private String fechaDeNacimiento;
    private String lugarDeNacimiento;
    private int edad;
    private double estatura;
    private char sexo;
    private String nivelDeEstudios;
    private String situacionMilitar;
    private String dni;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNivelDeEstudios() {
        return nivelDeEstudios;
    }

    public String getSituacionMilitar() {
        return situacionMilitar;
    }

    public String getDni() {
        return dni;
    }
  
    public Persona(String nombre, String apellidos, String fechaDeNacimiento, String lugarDeNacimiento, int edad, double estatura, char sexo, String nivelDeEstudios, String situacionMilitar, String dni){
this.nombre = nombre;
this.apellidos = apellidos;
this.fechaDeNacimiento = fechaDeNacimiento;
this.lugarDeNacimiento = lugarDeNacimiento;
this.edad = edad;
this.estatura = estatura;
this.sexo = sexo;
this.nivelDeEstudios = nivelDeEstudios;
this.situacionMilitar = situacionMilitar;
this.dni = dni;
}

}

