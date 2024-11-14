/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ezequiel
 */
public class Comida {

    private int id_comida;
    private String nombre;
    private int calorias_por_100g;
    private String tipo;
    private String detalle;

    public Comida() {
    }

    public Comida(String nombre, int calorias_por_100g, String tipo, String detalle) {
        this.nombre = nombre;
        this.calorias_por_100g = calorias_por_100g;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias_por_100g() {
        return calorias_por_100g;
    }

    public void setCalorias_por_100g(int calorias_por_100g) {
        this.calorias_por_100g = calorias_por_100g;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "id: " + id_comida + ", nombre: " + nombre + ", calorias por 100g: " + calorias_por_100g + ", tipo: " + tipo + ", detalle: " + detalle;
    }

}
