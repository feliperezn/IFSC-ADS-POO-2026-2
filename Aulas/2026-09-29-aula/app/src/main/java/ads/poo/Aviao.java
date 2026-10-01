package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private Double maxCombustivel;
    private ArrayList<Motor> motores;
    private boolean ligado = false;

    public Aviao(int maxTripulantes, int maxPassageiros, double maxCombustivel, int totalMotores, String tipoMotor) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.motores = new ArrayList<>();

        for (int i = 0; i < totalMotores; i++) {
            this.motores.add(new Motor(tipoMotor));
        }
    }

    public void ligarDesligar() {
        if (this.ligado == false) {
            // Liga o avião
            this.ligado = true;

            // Liga todos motores
            for (Motor motor : motores) { // Usando for-each para percorrer a lista
                if (motor.isLigado() == false) {
                    motor.setLigado(true);
                }
            }

        } else {
            // Desliga o avião
            this.ligado = false;

            // Desliga os motores
            for (Motor motor : motores) { // Usando for-each para percorrer a lista
                if (motor.isLigado() == true) {
                    motor.setLigado(false);
                }
            }
        }
    }

    public void ligarDesligarMotor(int index) {
        Motor motor = this.motores.get(index);

        if (motor.isLigado() == false) {
            motor.setLigado(true);
        } else {
            motor.setLigado(false);
        }
    }

    public int getMaxTripulantes() {
        return maxTripulantes;
    }

    public void setMaxTripulantes(int maxTripulantes) {
        this.maxTripulantes = maxTripulantes;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public Double getMaxCombustivel() {
        return maxCombustivel;
    }

    public void setMaxCombustivel(Double maxCombustivel) {
        this.maxCombustivel = maxCombustivel;
    }

    public ArrayList<Motor> getMotores() {
        return motores;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
