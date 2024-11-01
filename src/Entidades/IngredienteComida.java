
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
    private List<Ingrediente>listaIngredientes;

    public IngredienteComida() {
        listaIngredientes = new ArrayList<>();
    }

    public IngredienteComida(Comida comida) {
        listaIngredientes = new ArrayList<>();
        this.comida = comida;

    }

    public IngredienteComida(int idingredienteComida, Comida comida) {
        this.idingredienteComida = idingredienteComida;
        this.comida = comida;
        listaIngredientes = new ArrayList<>();
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

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    @Override
    public String toString() {
        return "IngredienteComida{" + "idingredienteComida=" + idingredienteComida
                + ", comida=" + comida 
                + ", listaIngredientes=" + listaIngredientes + '}';
    }
}
