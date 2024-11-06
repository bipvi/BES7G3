package bip.vi.BES7G3.entities;

import java.util.Date;

public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome;}
    public String getCognome() { return cognome;}
    public void setCognome(String cognome) { this. cognome = cognome;}
    public Date getDataDiNascita() { return dataDiNascita;}
    public void setDataDiNascita (Date dataDiNascita) { this. dataDiNascita = dataDiNascita;}


    public Info(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Info{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}

