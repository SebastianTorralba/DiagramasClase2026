package objetos;

import objetos.interfaces.ITitular;

import java.io.Serializable;

public class Titular extends Docente implements ITitular {
    public Titular(String dni, String nombre, String apellido,int legajo) {
        super(dni, nombre, apellido, legajo);
    }

    @Override
    public void explicarTeoria() {
        System.out.println("Explicando teoria");
    }
}
