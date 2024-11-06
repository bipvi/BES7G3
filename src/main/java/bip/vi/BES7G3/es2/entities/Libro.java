package bip.vi.BES7G3.es2.entities;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titolo;
    private List<Autore> autori;
    private List<Sezione> sezioni;
    private double prezzo;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = new ArrayList<>();
        this.sezioni = new ArrayList<>();
    }

    public void aggiungiAutore(Autore autore) {
        autori.add(autore);
    }

    public void aggiungiSezione(Sezione sezione) {
        sezioni.add(sezione);
    }

    public int numeroTotalePagine() {
        int totale = 0;
        for (Sezione sezione : sezioni) {
            totale += sezione.numeroPagine();
        }
        return totale;
    }

    public void stampaPagina(Pagina pagina) {
        System.out.println(pagina.getContenuto());
    }

    public void stampaSezione(Sezione sezione) {
        System.out.println("Sezione: " + sezione.getTitolo());
        for (Pagina pagina : sezione.numeroPagine()) {
            stampaPagina(pagina);
        }
        for (Sezione sottosezione : sezione.getSottosezioni()) {
            stampaSezione(sottosezione);
        }
    }

    public void stampaLibro() {
        System.out.println("Titolo: " + titolo);
        for (Sezione sezione : sezioni) {
            stampaSezione(sezione);
        }
    }

    public double getPrezzo() {
        return prezzo;
    }
}
