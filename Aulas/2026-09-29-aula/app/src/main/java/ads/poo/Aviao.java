package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private Double maxCombustivel;
    private ArrayList<Motor> motores;
    private boolean ligado = false;

    public Aviao(int maxTripulantes, int maxPassageiros, Double maxCombustivel, ArrayList<Motor> motores) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.motores = motores;
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

    }

}
