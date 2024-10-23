
package Entidades;

/**
 *
 * @author Grupo 3
 */
public class Paciente {
    private  int idPaciente;
    private int dni;
    private String nombre;
    private int edad;
    private Double altura;
    private Double pesoActual;
    private Double pesoEsperado;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(int dni, String nombre, int edad, Double altura, Double pesoActual, Double pesoEsperado, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoEsperado = pesoEsperado;
        this.estado = estado;
    }

    public Paciente(int idPaciente, int dni, String nombre, int edad, Double altura, Double pesoActual, Double pesoEsperado, boolean estado) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoEsperado = pesoEsperado;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Double getPesoEsperado() {
        return pesoEsperado;
    }

    public void setPesoEsperado(Double pesoEsperado) {
        this.pesoEsperado = pesoEsperado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", pesoActual=" + pesoActual + ", pesoEsperado=" + pesoEsperado + ", estado=" + estado + '}';
    }

  
}
