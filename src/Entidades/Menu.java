
package Entidades;

/**
 *
 * @author Grupo 3
 */
public class Menu {
    private int idMenu;
    private int diaNumero;
    private Boolean estado;
    private Dieta dieta;

    public Menu() {
    }

    public Menu(int diaNumero, Boolean estado, Dieta dieta) {
        this.diaNumero = diaNumero;
        this.estado = estado;
        this.dieta = dieta;
    }

    public Menu(int idMenu, int diaNumero, Boolean estado, Dieta dieta) {
        this.idMenu = idMenu;
        this.diaNumero = diaNumero;
        this.estado = estado;
        this.dieta = dieta;
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

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Menu{" + "idMenu=" + idMenu + ", diaNumero=" + diaNumero + ", estado=" + estado + ", dieta=" + dieta + '}';
    }
    
    
}
