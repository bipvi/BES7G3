package bip.vi.BES7G3.es1.entities;

import bip.vi.BES7G3.es1.entities.interfaces.DataSource;

public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }

    @Override
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    @Override
    public int getEta() {
        return this.eta;
    }

    public UserData(String nomeCompleto, int eta) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
