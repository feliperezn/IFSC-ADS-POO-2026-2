package ads.poo;

public class Motor {
    private String tipo;
    private boolean ligado = false;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + " - Ligado: " + ligado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
