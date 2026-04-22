package objetos;

import java.util.Objects;

public class Alumno extends Persona {
    private String matricula;



    public Alumno(String dni, String nombre, String apellido, String matricula) {
        super(dni, nombre, apellido);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula +" "+ super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(matricula, alumno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
