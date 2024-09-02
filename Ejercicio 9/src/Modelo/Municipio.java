/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Municipio {
    private String nombre;
    private String codigo;
    private int poblacionDerecho;
    private int poblacionHecho;

    public Municipio(String nombre, String codigo, int poblacionDerecho, int poblacionHecho) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.poblacionDerecho = poblacionDerecho;
        this.poblacionHecho = poblacionHecho;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPoblacionDerecho() {
        return poblacionDerecho;
    }

    public void aumentarPoblacionDerecho() {
        this.poblacionDerecho++;
    }

    public int getPoblacionHecho() {
        return poblacionHecho;
    }

    public void aumentarPoblacionHecho() {
        this.poblacionHecho++;
    }
}
