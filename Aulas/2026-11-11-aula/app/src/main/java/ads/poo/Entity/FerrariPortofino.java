package ads.poo.Entity;

public class FerrariPortofino extends Vehicle implements Convertible {
    Boolean roofOpened = false;
    Boolean stabilityControl = false;

    public FerrariPortofino() {
    }

    public String toggleStaControl() {
        this.stabilityControl = !this.stabilityControl;
        return "Stability Control: " + (this.stabilityControl ? "enabled" : "disabled");
    }

    @Override
    public String toggleRoof() {

        if (this.currSpeed == 0 && this.roofOpened == false) {
            this.roofOpened = true;
        } else {
            this.roofOpened = false;
        }

        return "Ferrari roof: " + (this.roofOpened ? "opened" : "already opened or current speed > 0");
    }

}
