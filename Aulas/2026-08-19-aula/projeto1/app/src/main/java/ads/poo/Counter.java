package ads.poo;

public class Counter {
    // Properties
    private int currentValue;

    // Methods
    public void setValue(int value) {
        currentValue = value;
    }

    public void addValue() {
        currentValue += 1;
    }

    public void clearValue() {
        setValue(0);
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
