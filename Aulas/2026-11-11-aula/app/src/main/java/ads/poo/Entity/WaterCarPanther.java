package ads.poo.Entity;

public class WaterCarPanther extends Amphibian implements Convertible, Awd {
    Boolean awdEnabled = false;
    Boolean roofOpened = false;
    int miniFridgeTemp = 0;

    public void setMiniFridgeTemp(int miniFridgeTemp) {
        // TODO min/max temperature = 0-10
        this.miniFridgeTemp = miniFridgeTemp;
    }

    @Override
    public String toggleAwd() {
        if (this.awdEnabled == false) {
            this.awdEnabled = true;
        } else {
            this.awdEnabled = false;
        }

        String awdStatus = this.awdEnabled ? "opened" : "closed";

        return "WaterCarPanther roof: " + awdStatus;
    }

    @Override
    public String toggleRoof() {
        if (this.roofOpened == false) {
            this.roofOpened = true;
        } else {
            this.roofOpened = false;
        }

        String roofStatus = this.roofOpened ? "opened" : "closed";

        return "WaterCarPanther roof: " + roofStatus;
    }

    @Override
    public String retractWheels() {
        return "Retraindo rodas do WaterCarPanther";
    }

}
