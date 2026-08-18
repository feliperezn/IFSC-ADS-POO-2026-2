package ads.poo;

public class Car {
  // properties
  private int currentSpeed;
  private int maxSpeed;

  // methods
  public void accelerate(int increment) {

    if ((currentSpeed + increment) > maxSpeed) {
      currentSpeed = maxSpeed;
    } else {
      currentSpeed += increment;
    }

  }

  public void setMaxSpeed(int speed) {
    maxSpeed = speed;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

}