package objetos;

import objetos.interfaces.IJtp;

public class Jtp extends Docente implements IJtp {
    public Jtp(String dni, String nombre, String apellido, int legajo) {
        super(dni, nombre, apellido, legajo);
    }

    @Override
    public void explicarPractica() {
        System.out.println("Explicando Practica de Jtp");
    }

    @Override
    public void corregirTrabajoPractico() {
        System.out.println("Corregir Trabajo Practico");
    }
}
