/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ezequiel
 */
public class Paciente {

    private int id_paciente;
    private String nombre;
    private int edad;
    private float altura;
    private float peso_actual;
    private float peso_buscado;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(String nombre, int edad, float altura, float peso_actual, float peso_buscado, boolean estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso_actual = peso_actual;
        this.peso_buscado = peso_buscado;
        this.estado = estado;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso_actual() {
        return peso_actual;
    }

    public void setPeso_actual(float peso_actual) {
        this.peso_actual = peso_actual;
    }

    public float getPeso_buscado() {
        return peso_buscado;
    }

    public void setPeso_buscado(float peso_buscado) {
        this.peso_buscado = peso_buscado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }

}
