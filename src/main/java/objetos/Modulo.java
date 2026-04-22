package objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Modulo {
    private int numero;
    private Departamento departamento;
    private ArrayList<Aula> aulas=new ArrayList<Aula>();

    public Modulo(int numero, Departamento departamento) {
        this.numero = numero;
        this.departamento = departamento;
    }

    public Aula getAula(int index) {
        return aulas.get(index);
    }

    public boolean addAula(int numero) {
        Aula a= new Aula(numero);
        return aulas.add(a);
    }

    public int sizeAulas() {
        return aulas.size();
    }



    //inner class
    public class Aula {
        private int numero;

        public Aula(int numero) {
            this.numero = numero;
        }

        private List<Alumno> alumnos=new ArrayList<Alumno>();

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
