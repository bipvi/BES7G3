package bip.vi.BES7G3.es2.entities;



import java.util.ArrayList;
import java.util.List;

public class Sezione {
    private String titolo;
    private List<Sezione> sottosezioni;
    private List<Pagina> pagine;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.sottosezioni = new ArrayList<>();
        this.pagine = new ArrayList<>();
    }

    public void aggiungiSottosezione(Sezione sottosezione) {
        sottosezioni.add(sottosezione);
    }

    public void aggiungiPagina(Pagina pagina) {
        pagine.add(pagina);
    }

    public int numeroPagine() {
        int totale = pagine.size();
        for (Sezione sottosezione : sottosezioni) {
            totale += sottosezione.numeroPagine();
        }
        return totale;
    }

    public String getTitolo() {
        return titolo;
    }
}