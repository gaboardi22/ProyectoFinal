
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class MenuRenglon {
    private int idMenuRenglon;
    private Menu menu;
    private List<Renglon> renglones;

    public MenuRenglon() {
        renglones  =new ArrayList<>();
    }

    public MenuRenglon(Menu menu, List<Renglon> renglones) {
        renglones  =new ArrayList<>();
        this.menu = menu;
        this.renglones = renglones;
    }

    public MenuRenglon(int idMenuRenglon, Menu menu, List<Renglon> renglones) {
        renglones  =new ArrayList<>();
        this.idMenuRenglon = idMenuRenglon;
        this.menu = menu;
        this.renglones = renglones;
    }

    public int getIdMenuRenglon() {
        return idMenuRenglon;
    }

    public void setIdMenuRenglon(int idMenuRenglon) {
        this.idMenuRenglon = idMenuRenglon;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Renglon> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<Renglon> renglones) {
        this.renglones = renglones;
    }

    @Override
    public String toString() {
        return "MenuRenglon{" + "idMenuRenglon=" + idMenuRenglon + ", menu=" + menu + ", renglones=" + renglones + '}';
    }

    
}
