import objetos.*;

import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Alumno("222222", "Gustavo", "Neyra", "ELSI359"); //Declaracion e Instanciacion de un objeto
        Alumno clon = new Alumno("222222", "Gustavo", "Neyra", "ELSI359"); //Declaracion e Instanciacion de un objeto

        Docente p1 = new Jtp("222", "JTP", "JTP", 111);

        Jtp j = (Jtp) p1;


        Docente docente; //Declaracion == null distinto 0 ""
        System.out.println(p);
        docente = new Docente("28403003", "Sebastian", "Torralba", 123); //Instanciacion
        System.out.println(docente);
        Persona test = p; //Declaracion y asignado
        // comparacion == compara referencias
        if (p == test) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }

        if (p == clon) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }
        // comparacion con equals compara los datos del objeto
        if (p.equals(clon)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }
        // Inner Class Composicion
        //      Modulo.Aula aula=new Modulo.Aula();
        //      Modulo modulo=new Modulo();
        //      modulo.addAula(aula);
        Departamento departamento = new Departamento(1, "Exactas", null);


        Modulo modulo = new Modulo(4, departamento);

        modulo.addAula(101);
        modulo.addAula(102);
        modulo.addAula(103);

        System.out.println(modulo.sizeAulas());

        modulo.getAula(1).addAlumno((Alumno) p);
        modulo.getAula(1).addAlumno(clon);

        System.out.println("Listar Alumnos Aula");
        System.out.println(modulo.getAula(1).sizeAlumnos());
        Iterator i = modulo.getAula(1).alumnosIterator();
        while (i.hasNext()) {
            Alumno alumno = (Alumno) i.next();
            System.out.println(alumno);
        }




    }
}
