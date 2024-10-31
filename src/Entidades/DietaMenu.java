
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class DietaMenu {
    private int idDietaMenu;
    private Dieta dieta;
    private List<Menu> listaMenu;

    public DietaMenu() {
        listaMenu  =new ArrayList<>();
    }

    public DietaMenu(Dieta dieta, List<Menu> listaMenu) {
        listaMenu  =new ArrayList<>();
        this.dieta = dieta;
        this.listaMenu = listaMenu;
    }

    public DietaMenu(int idDietaMenu, Dieta dieta, List<Menu> listaMenu) {
        listaMenu  =new ArrayList<>();
        this.idDietaMenu = idDietaMenu;
        this.dieta = dieta;
        this.listaMenu = listaMenu;
    }
    
    
}
