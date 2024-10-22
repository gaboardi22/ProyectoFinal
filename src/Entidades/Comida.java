
package Entidades;

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
    private Boolean baja;

    public Comida() {
    }

    public Comida(String nombre, String tipoComida, int caloriasPorcion, String detalle, Boolean baja) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorcion = caloriasPorcion;
        this.detalle = detalle;
        this.baja = baja;
    }

    public Comida(int idComida, String nombre, String tipoComida, int caloriasPorcion, String detalle, Boolean baja) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.caloriasPorcion = caloriasPorcion;
        this.detalle = detalle;
        this.baja = baja;
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

    public Boolean getBaja() {
        return baja;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", tipoComida=" + tipoComida + ", caloriasPorcion=" + caloriasPorcion + ", detalle=" + detalle + ", baja=" + baja + '}';
    }
    
    
}
