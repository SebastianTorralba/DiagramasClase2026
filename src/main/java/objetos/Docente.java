package objetos;

import java.util.Objects;

public class Docente extends Persona {
    private Integer legajo;


    public Docente(String dni, String nombre, String apellido, Integer legajo) {
        super(dni, nombre, apellido);
        this.legajo = legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Docente docente = (Docente) o;
        return Objects.equals(legajo, docente.legajo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(legajo);
    }
}
