/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Distrito {
    private String nombre;
    private ArrayList<Manzana> manzanas;

    public Distrito(String nombre) {
        this.nombre = nombre;
        this.manzanas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Manzana> getManzanas() {
        return manzanas;
    }

    public void agregarManzana(Manzana manzana) {
        this.manzanas.add(manzana);
    }

    public void mostrarManzanas() {
        for (Manzana manzana : manzanas) {
            System.out.println("Manzana ID: " + manzana.getId());
            manzana.mostrarDirecciones();
        }
    }
}

