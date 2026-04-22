package objetos;


import java.util.ArrayList;

public record Departamento (Integer id, String nombre, ArrayList<Carrera> carreras){

    public Carrera removeCarrera(int index) {
        return carreras.remove(index);
    }

    public boolean addCarrera(Carrera carrera) {
        return carreras.add(carrera);
    }

    public Carrera getCarrera(int index) {
        return carreras.get(index);
    }

    public int sizeCarreras() {
        return carreras.size();
    }
}
