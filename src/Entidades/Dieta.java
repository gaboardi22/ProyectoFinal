/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Ezequiel
 */
public class Dieta {

    private int id_dieta;
    private String nombre;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Paciente paciente;
    private float peso_inicial;
    private float peso_final;
    private int calorias_totales;
//    private boolean estado;

    public Dieta() {
    }

    public Dieta(String nombre, LocalDate fecha_inicio, LocalDate fecha_fin, Paciente paciente, int calorias_totales) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.paciente = paciente;
        this.calorias_totales = calorias_totales;
    }

    public Dieta(String nombre, LocalDate fecha_inicio, LocalDate fecha_fin, Paciente paciente, float peso_inicial, float peso_final, int calorias_totales) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.paciente = paciente;
        this.peso_inicial = peso_inicial;
        this.peso_final = peso_final;
        this.calorias_totales = calorias_totales;
//        this.estado = estado; boolean estado
    }

    public int getId_dieta() {
        return id_dieta;
    }

    public void setId_dieta(int id_dieta) {
        this.id_dieta = id_dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public float getPeso_inicial() {
        return peso_inicial;
    }

    public void setPeso_inicial(float peso_inicial) {
        this.peso_inicial = peso_inicial;
    }

    public float getPeso_final() {
        return peso_final;
    }

    public void setPeso_final(float peso_final) {
        this.peso_final = peso_final;
    }

    public int getCalorias_totales() {
        return calorias_totales;
    }

    public void setCalorias_totales(int calorias_totales) {
        this.calorias_totales = calorias_totales;
    }

//    public boolean isEstado() {
//        return estado;
//    }
//
//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    } estado + 

    @Override
    public String toString() {
        return "id: " + id_dieta + ", nombre: " + nombre + ", fecha de inicio: " + fecha_inicio + ", fecha final: " + fecha_fin + ", paciente: " + paciente + ", peso inicial: " + peso_inicial + ", peso final: " + peso_final + ", calorias totales: " + calorias_totales;
    }

}
