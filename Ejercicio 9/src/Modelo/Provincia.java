/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jerem
 */
public class Provincia {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPoblacionDeDerecho() {
        return poblacionDeDerecho;
    }

    public void setPoblacionDeDerecho(int poblacionDeDerecho) {
        this.poblacionDeDerecho = poblacionDeDerecho;
    }

    public int getPoblacionDeHecho() {
        return poblacionDeHecho;
    }

    public void setPoblacionDeHecho(int poblacionDeHecho) {
        this.poblacionDeHecho = poblacionDeHecho;
    }
    private int codigo;
    private int poblacionDeDerecho;
    private int poblacionDeHecho;

}
