package bip.vi.BES7G3.entities;

import bip.vi.BES7G3.interfaces.DataSource;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class UserDataAdapter implements DataSource {

    private String nomeCompleto;
    private int eta;

    public UserDataAdapter(Info info){
        this.nomeCompleto = info.getNome() + ' ' + info.getCognome();

        LocalDate dataNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate oggi = LocalDate.now();
        this.eta = Period.between(dataNascita, oggi).getYears();
    }

    @Override
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    @Override
    public int getEta() {
        return this.eta;
    }

    @Override
    public String toString() {
        return "UserDataAdapter{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}
