/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Manzana {
    private String id;
    private ArrayList<Direccion> direcciones;

    public Manzana(String id) {
        this.id = id;
        this.direcciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void agregarDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }

    public void mostrarDirecciones() {
        for (Direccion direccion : direcciones) {
            System.out.println(direccion.getCalle() + " " + direccion.getNumero());
        }
    }
}

