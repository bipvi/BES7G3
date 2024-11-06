package bip.vi.BES7G3.es2.entities;

import java.util.Objects;

public class Autore {
    private String nome;

    public Autore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autore)) return false;
        Autore autore = (Autore) o;
        return Objects.equals(nome, autore.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
