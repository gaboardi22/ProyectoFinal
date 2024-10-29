
package Entidades;

/**
 *
 * @author Grupo 3
 */
public class RenglonMenu {
    private int idRenglon;
    private Comida comida;
    private int cantidadGramos;
    private int subTotalCalorias;

    public RenglonMenu() {
    }

    public RenglonMenu(Comida comida, int cantidadGramos, int subTotalCalorias) {
        this.comida = comida;
        this.cantidadGramos = cantidadGramos;
        this.subTotalCalorias = subTotalCalorias;
    }

    public RenglonMenu(int idRenglon, Comida comida, int cantidadGramos, int subTotalCalorias) {
        this.idRenglon = idRenglon;
        this.comida = comida;
        this.cantidadGramos = cantidadGramos;
        this.subTotalCalorias = subTotalCalorias;
    }

    public int getIdRenglon() {
        return idRenglon;
    }

    public void setIdRenglon(int idRenglon) {
        this.idRenglon = idRenglon;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public int getCantidadGramos() {
        return cantidadGramos;
    }

    public void setCantidadGramos(int cantidadGramos) {
        this.cantidadGramos = cantidadGramos;
    }

    public int getSubTotalCalorias() {
        return subTotalCalorias;
    }

    public void setSubTotalCalorias(int subTotalCalorias) {
        this.subTotalCalorias = subTotalCalorias;
    }

    @Override
    public String toString() {
        return "RenglonMenu{" + "idRenglon=" + idRenglon + ", comida=" + comida + ", cantidadGramos=" + cantidadGramos + ", subTotalCalorias=" + subTotalCalorias + '}';
    }
    
    
}
