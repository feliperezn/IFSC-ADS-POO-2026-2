package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro() {

    }

    public void acelerar(int v) {
        this.propulsor.acelerar(v);
    }

    public void trocarMotor(Motor mo) {
        this.propulsor = mo;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getPropulsor() {
        return propulsor;
    }

}
