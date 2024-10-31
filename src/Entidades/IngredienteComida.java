
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class IngredienteComida {
    
    private int idingredienteComida;
    private Comida comida;
    private int cantidad;
    private List<Ingrediente>listaIngredientes;

    public IngredienteComida() {
        listaIngredientes = new ArrayList<>();
    }

    public IngredienteComida(Comida comida, int cantidad, List<Ingrediente> listaIngredientes) {
        listaIngredientes = new ArrayList<>();
        this.comida = comida;
        this.cantidad = cantidad;
        this.listaIngredientes = listaIngredientes;
    }

    public IngredienteComida(int idingredienteComida, Comida comida, int cantidad, List<Ingrediente> listaIngredientes) {
        listaIngredientes = new ArrayList<>();
        this.idingredienteComida = idingredienteComida;
        this.comida = comida;
        this.cantidad = cantidad;
        this.listaIngredientes = listaIngredientes;
    }

    public int getIdingredienteComida() {
        return idingredienteComida;
    }

    public void setIdingredienteComida(int idingredienteComida) {
        this.idingredienteComida = idingredienteComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return "IngredienteComida{" + "idingredienteComida=" + idingredienteComida + ", comida=" + comida + ", cantidad=" + cantidad + ", listaIngredientes=" + listaIngredientes + '}';
    }
     
     
}
