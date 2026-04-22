import objetos.*;

public class Principal {
    public static void main(String[] args) {
        Persona p = new Alumno("222222","Gustavo","Neyra","ELSI359"); //Declaracion e Instanciacion de un objeto
        Persona clon = new Alumno("222222","Gustavo","Neyra","ELSI359"); //Declaracion e Instanciacion de un objeto

        Docente p1 = new Jtp("222","JTP","JTP",111);

        Jtp j = (Jtp) p1;

        

        Docente docente; //Declaracion == null distinto 0 ""
        System.out.println(p);
        docente = new Docente("28403003","Sebastian","Torralba",123); //Instanciacion
        System.out.println(docente);
        Persona test=p; //Declaracion y asignado

        if (p==test) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }

        if (p==clon) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }

        if (p.equals(clon)){
            System.out.println("Son iguales");
        } else {
            System.out.println("NO iguales");
        }


    }
}
