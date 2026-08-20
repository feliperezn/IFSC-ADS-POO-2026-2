package ads.poo;

public class App {
    public static void main(String[] args) {

        Hero knight = new Hero();

        knight.drinkPoison(3);
        IO.println("Hero has drinked poison!");
        IO.println("- Vitality: " + knight.showVitality());

        knight.workout();
        IO.println("Hero worked out");
        IO.println("- Stamina: " + knight.showStamina());
        IO.println("- Strength: " + knight.showStrength());

        knight.workout();
        IO.println("Hero worked out");
        IO.println("- Stamina: " + knight.showStamina());
        IO.println("- Strength: " + knight.showStrength());

        knight.drinkPoison(1);
        IO.println("Hero has drinked poison!");
        IO.println("- Vitality: " + knight.showVitality());

        knight.rest();
        IO.println("Hero rested...");
        IO.println("- Stamina: " + knight.showVitality());

    }
}
