
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class Comida {
    private int idComida;
    private String nombre;
    private String tipoComida;
    private int caloriasPorcion;
    private String detalle;
    private Boolean estado;
    private List<Ingrediente>listaIngredientes;

    public Comida() {
    }

    public Comida(String nombre, String tipoComida, int caloriasPorcion, String detalle, Boolean estado) {
        listaIngredientes  =new ArrayList<>();
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorcion = caloriasPorcion;
        this.detalle = detalle;
        this.estado = estado;
    }

    public Comida(int idComida, String nombre, String tipoComida, int caloriasPorcion, String detalle, Boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorcion = caloriasPorcion;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getCaloriasPorcion() {
        return caloriasPorcion;
    }

    public void setCaloriasPorcion(int caloriasPorcion) {
        this.caloriasPorcion = caloriasPorcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", tipoComida=" + tipoComida + ", caloriasPorcion=" + caloriasPorcion + ", detalle=" + detalle + ", estado=" + estado + '}';
    }
}
