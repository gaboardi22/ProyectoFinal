
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Grupo 3
 */
public class Registro {
    private int idRegistro;
    private Paciente paciente;
    private LocalDate fecha;
    private int peso;

    public Registro() {
    }

    public Registro(Paciente paciente, LocalDate fecha, int peso) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.peso = peso;
    }

    public Registro(int idRegistro, Paciente paciente, LocalDate fecha, int peso) {
        this.idRegistro = idRegistro;
        this.paciente = paciente;
        this.fecha = fecha;
        this.peso = peso;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + ", paciente=" + paciente + ", fecha=" + fecha + ", peso=" + peso + '}';
    }
    
    
    
}
