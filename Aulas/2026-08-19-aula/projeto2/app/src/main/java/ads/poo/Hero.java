package ads.poo;

public class Hero {
    // properties
    private int strength = 0;
    private int stamina = 100;
    private int vitality = 100;

    // methods
    public void drinkHealPotion(int potion) {
        vitality = Math.max(vitality + potion, 100);
    }

    public void drinkPoison(int quantity) {
        int poison = 15;
        vitality = Math.max(vitality - (poison * quantity), 0);
    }

    public void workout() {
        if (stamina > 10) {
            strength += 10;
            stamina -= 5;
        }
    }

    public void rest() {
        stamina += 50;
    }

    public int showStamina() {
        return stamina;
    }

    public int showStrength() {
        return strength;
    }

    public int showVitality() {
        return vitality;
    }
}