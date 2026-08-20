package ads.poo;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.setValue(50);
        IO.println("Valor atual: " + counter.getCurrentValue());

        counter.addValue();
        counter.addValue();
        counter.addValue();
        IO.println("Valor atual: " + counter.getCurrentValue());
    }
}
