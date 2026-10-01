package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Aviao a320 = new Aviao(10, 250, 1000, 4, "turbina");

        a320.ligarDesligar(); // ligar aviao
        IO.println("Status do avião : " + a320.isLigado());

        IO.println(a320.getMotores().toString());

        a320.ligarDesligarMotor(3);
        IO.println(a320.getMotores().toString());
    }
}
