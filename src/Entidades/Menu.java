
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class Menu {
    private int idMenu;
    private int diaNumero;
    private Boolean estado;
    private List<Renglon>renglones;
   

    public Menu() {
        renglones = new ArrayList<>();
    }

    public Menu(int diaNumero, Boolean estado) {
        renglones = new ArrayList<>();
        this.diaNumero = diaNumero;
        this.estado = estado;
    }

    public Menu(int idMenu, int diaNumero, Boolean estado) {
        renglones = new ArrayList<>();
        this.idMenu = idMenu;
        this.diaNumero = diaNumero;
        this.estado = estado;
    }

    public List<Renglon> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<Renglon> renglones) {
        this.renglones = renglones;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getDiaNumero() {
        return diaNumero;
    }

    public void setDiaNumero(int diaNumero) {
        this.diaNumero = diaNumero;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu 
                + ", diaNumero=" + diaNumero 
                + ", estado=" + estado
                + ", renglones=" + renglones + '}';
    }
}
