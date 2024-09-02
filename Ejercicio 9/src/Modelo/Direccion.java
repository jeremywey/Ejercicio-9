/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Direccion {
    private String calle;
    private int numero;
    private Manzana manzana;  // Nueva relación

    public Direccion(String calle, int numero, Manzana manzana) {
        this.calle = calle;
        this.numero = numero;
        this.manzana = manzana;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public Manzana getManzana() {
        return manzana;
    }
}
