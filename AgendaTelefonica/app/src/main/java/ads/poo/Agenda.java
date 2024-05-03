package ads.poo;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        return contatos.add(c);
    }

    public boolean removeContato(String n, String s){
        return contatos.removeIf(c -> c.getNome().equals(n) && c.getSobrenome().equals(s));
    }

    public boolean addTelofone(String r, String n, Contato c){
        return c.addTelefone(r, n);
    }

    public boolean addEmail(String r, String e, Contato c){
        return c.addEmail(r, e);
    }

    public boolean updateTelefone(String r, String n, Contato c){
        return c.updateTelefone(r, n);
    }
    public boolean updateEmail(String r, String e, Contato c){
        return c.updateEmail(r, e);
    }

    public boolean removeTelefone(String r, Contato c){
        return c.removeTelefone(r);
    }

    public boolean removeEmail(String r, Contato c){
        return c.removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
