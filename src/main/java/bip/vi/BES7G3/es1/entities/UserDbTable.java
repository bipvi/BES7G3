package bip.vi.BES7G3.es1.entities;

import bip.vi.BES7G3.es1.entities.interfaces.DataSource;

public class UserDbTable {

    public boolean correctData(DataSource ds){
        return ds.getEta() > 30 && !ds.getNomeCompleto().isEmpty();
    }

}
