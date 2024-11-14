/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ezequiel
 */
public class RenglonMenu {

    private int id_renglon;
    private MenuDiario menu_diario;
    private Comida comida;
    private int cantidad_gramos;
    private int subtotal_calorias;

    public RenglonMenu() {
    }

    public RenglonMenu(MenuDiario menu_diario, Comida comida, int cantidad_gramos, int subtotal_calorias) {
        this.menu_diario = menu_diario;
        this.comida = comida;
        this.cantidad_gramos = cantidad_gramos;
        this.subtotal_calorias = subtotal_calorias;
    }

    public int getId_renglon() {
        return id_renglon;
    }

    public void setId_renglon(int id_renglon) {
        this.id_renglon = id_renglon;
    }

    public MenuDiario getMenu_diario() {
        return menu_diario;
    }

    public void setMenu_diario(MenuDiario menu_diario) {
        this.menu_diario = menu_diario;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public int getCantidad_gramos() {
        return cantidad_gramos;
    }

    public void setCantidad_gramos(int cantidad_gramos) {
        this.cantidad_gramos = cantidad_gramos;
    }

    public int getSubtotal_calorias() {
        return subtotal_calorias;
    }

    public void setSubtotal_calorias(int subtotal_calorias) {
        this.subtotal_calorias = subtotal_calorias;
    }

    @Override
    public String toString() {
        return "id: " + id_renglon + ", menu diario: " + menu_diario + ", comida: " + comida + ", cantidad en gramos: " + cantidad_gramos + ", subtotal de calorias: " + subtotal_calorias;
    }

}
