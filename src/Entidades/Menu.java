
package Entidades;

import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class Menu {
    private int idMenu;
    private int diaNumero;
    private Boolean estado;
    private List<Renglon> renglonesMenu;

    public Menu() {
    }

    public Menu(int diaNumero, Boolean estado, List<Renglon> renglonesMenu) {
        this.diaNumero = diaNumero;
        this.estado = estado;
        this.renglonesMenu = renglonesMenu;
    }

    public Menu(int idMenu, int diaNumero, Boolean estado, List<Renglon> renglonesMenu) {
        this.idMenu = idMenu;
        this.diaNumero = diaNumero;
        this.estado = estado;
        this.renglonesMenu = renglonesMenu;
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

    public List<Renglon> getRenglonesMenu() {
        return renglonesMenu;
    }

    public void setRenglonesMenu(List<Renglon> renglonesMenu) {
        this.renglonesMenu = renglonesMenu;
    }

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu + ", diaNumero=" + diaNumero + ", estado=" + estado + ", renglonesMenu=" + renglonesMenu + '}';
    }

   
}
