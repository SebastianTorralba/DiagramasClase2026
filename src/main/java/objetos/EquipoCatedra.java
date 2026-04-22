package objetos;

import objetos.interfaces.IJtp;
import objetos.interfaces.ITitular;

import java.util.Arrays;
import java.util.List;

public class EquipoCatedra {
    private ITitular titular;
    private List<IJtp> jtps;

    public EquipoCatedra(ITitular titular , IJtp jtp) {
        this.titular = titular;
        this.jtps = Arrays.asList(jtp);
    }

    public EquipoCatedra(ITitular titular , List<IJtp> jtps) {
        this.titular = titular;
        this.jtps = jtps;
    }

    public EquipoCatedra() {}
    // patron delegate sobre lista de jtps

    public boolean addJtp(IJtp iJtp) {
        return jtps.add(iJtp);
    }

    public boolean removeJtp(Object o) {
        return jtps.remove(o);
    }

    public int cantidadJtps() {
        return jtps.size();
    }

    public ITitular getTitular() {
        return titular;
    }

    public void setTitular(ITitular titular) {
        this.titular = titular;
    }
}
