package objetos;

import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private List<Carrera> carreras;

    public int size() {
        return carreras.size();
    }

    public boolean addCarrera(Carrera carrera) {
        return carreras.add(carrera);
    }

    public Carrera getCarrera(int index) {
        return carreras.get(index);
    }

    public Carrera removeCarrera(int index) {
        return carreras.remove(index);
    }
}
