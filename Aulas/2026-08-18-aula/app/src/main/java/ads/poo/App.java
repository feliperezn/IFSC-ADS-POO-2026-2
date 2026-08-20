package ads.poo;

public class App {

    public static void main(String[] args) {

        Car yaris = new Car();

        yaris.setMaxSpeed(100);

        yaris.accelerate(20);
        IO.println("Acelerou 20");
        yaris.accelerate(100);
        IO.println("Acelerou 100");

        IO.println("Velocidade atual: " + yaris.getCurrentSpeed());

        IO.println("Freiou 200");
        yaris.brake(200);
        IO.println("Velocidade atual: " + yaris.getCurrentSpeed());

    }

}
