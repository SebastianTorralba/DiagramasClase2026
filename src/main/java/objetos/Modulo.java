package objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Modulo {
    private int numero;
    private Departamento departamento;
    private ArrayList<Aula> aulas;

    public Aula getAula(int index) {
        return aulas.get(index);
    }

    public boolean addAula(Aula aula) {
        return aulas.add(aula);
    }

    public int sizeAulas() {
        return aulas.size();
    }

    public class Aula {
        private int numero;
        private List<Alumno> alumnos;

        public boolean addAlumno(Alumno alumno) {
            return alumnos.add(alumno);
        }

        public boolean removeAlumno(Object o) {
            return alumnos.remove(o);
        }

        public Alumno getAlumno(int index) {
            return alumnos.get(index);
        }

        public int sizeAlumnos() {
            return alumnos.size();
        }

        public Iterator<Alumno> alumnosIterator() {
            return alumnos.iterator();
        }
    }
}
