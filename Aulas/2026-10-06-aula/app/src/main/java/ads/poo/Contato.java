package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobreNome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;

        this.telefones = new HashMap<>();
        this.emails = new HashMap<>();
    }

    public boolean addTelefone(String rotulo, Telefone valor) {
        // Valida se o telefone já existe
        if (this.telefones.containsKey(rotulo)) {
            return false;
        }

        this.telefones.put(rotulo, valor);
        return true;
    }

    public boolean addEmail(String rotulo, Email valor) {
        // Valida se o email já existe
        if (this.emails.containsKey(rotulo)) {
            return false;
        }

        this.emails.put(rotulo, valor);
        return true;
    }

    public boolean removeTelefone(String rotulo) {
        // Valida se o telefone existe para ser removido
        if (this.telefones.remove(rotulo) != null) {
            return true;
        }

        return false;
    }

    public boolean removeEmail(String rotulo) {
        // Valida se o email existe para ser removido
        if (this.emails.containsKey(rotulo)) {
            this.emails.remove(rotulo);
            return true;
        }

        return false;
    }

    public boolean updateTelefone(String rotulo, String valor) {
        // Valida se o telefone existe para ser atualizado
        if (this.telefones.containsKey(valor)) {
            this.telefones.get(valor).setNumero(valor);
            return true;
        }

        return false;
    }

    public boolean updateEmail(String rotulo, String valor) {
        // Valida se o email existe para ser atualizado
        if (this.emails.containsKey(valor)) {
            this.emails.get(valor).setemail(valor);
            return true;
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobreNome=" + sobreNome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }

}
