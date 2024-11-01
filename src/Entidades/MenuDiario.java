/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Ezequiel
 */
public class MenuDiario {

    private int id_menu_diario;
    private int dia;
    private int calorias;
    private Dieta dieta;
    private List<RenglonMenu> renglones;

    public MenuDiario() {
    }

    public MenuDiario(int dia, int calorias, Dieta dieta) {
        this.dia = dia;
        this.calorias = calorias;
        this.dieta = dieta;
    }

    public int getId_menu_diario() {
        return id_menu_diario;
    }

    public void setId_menu_diario(int id_menu_diario) {
        this.id_menu_diario = id_menu_diario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public List<RenglonMenu> getRenglones() {
        return renglones;
    }

    public void setRenglones(List<RenglonMenu> renglones) {
        this.renglones = renglones;
    }

    @Override
    public String toString() {
        return "MenuDiario{" + "id_menu_diario=" + id_menu_diario + ", dia=" + dia + ", calorias=" + calorias + ", dieta=" + dieta + ", renglones=" + renglones + '}';
    }

}
