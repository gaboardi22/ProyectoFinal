
package Entidades;

/**
 *
 * @author Grupo 3
 */
public class Ingrediente {
    private int id_ingrediente;
    private String nombre;
    private int calorias;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public Ingrediente(int id_ingrediente, String nombre, int calorias) {
        this.id_ingrediente = id_ingrediente;
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public int getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(int id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "id_ingrediente=" + id_ingrediente + ", nombre=" + nombre + ", calorias=" + calorias + '}';
    }
    
    
}
