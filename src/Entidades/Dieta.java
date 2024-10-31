
package Entidades;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Grupo 3
 */
public class Dieta {
    private int idDieta;
    private String nombreDieta;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private Boolean estado;
    private int totalCalorias;
    private Paciente paciente;

    public Dieta() {
    }

    public Dieta(String nombreDieta, LocalDate fechaIncio, LocalDate fechaFin, Boolean estado, int totalCalorias, Paciente paciente) {
        this.nombreDieta = nombreDieta;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
    }

    public Dieta(int idDieta, String nombreDieta, LocalDate fechaIncio, LocalDate fechaFin, Boolean estado, int totalCalorias, Paciente paciente) {
        this.idDieta = idDieta;
        this.nombreDieta = nombreDieta;

        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.totalCalorias = totalCalorias;
        this.paciente = paciente;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombreDieta() {
        return nombreDieta;
    }

    public void setNombreDieta(String nombreDieta) {
        this.nombreDieta = nombreDieta;
    }

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta
                + ", nombreDieta=" + nombreDieta 
                +  ", fechaIncio=" + fechaIncio 
                + ", fechaFin=" + fechaFin
                + ", estado=" + estado 
                + ", totalCalorias=" + totalCalorias 
                + ", paciente=" + paciente + '}';
    }
    
    
}