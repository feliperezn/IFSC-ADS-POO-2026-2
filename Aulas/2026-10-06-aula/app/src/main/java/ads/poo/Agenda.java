package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void addContato(Contato c) {
        this.contatos.add(c);
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome) {
        ArrayList<Contato> lista = new ArrayList<>();

        for (Contato elemento : contatos) {
            if (elemento.getNome().equals(nome)) {
                lista.add(elemento);
            }
        }

        return lista;
    }

    public boolean removeContato(int indiceContatoNaLista) {
        if (this.contatos.get(indiceContatoNaLista) != null) {
            this.contatos.remove(indiceContatoNaLista);
            return true;
        }

        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {
        if (this.contatos.get(indiceContatoNaLista) != null) {
            return this.contatos.get(indiceContatoNaLista).updateTelefone(rotulo, valor);
        }

        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {
        if (this.contatos.get(indiceContatoNaLista) != null) {
            return this.contatos.get(indiceContatoNaLista).updateEmail(rotulo, valor);
        }

        return false;
    }

}
