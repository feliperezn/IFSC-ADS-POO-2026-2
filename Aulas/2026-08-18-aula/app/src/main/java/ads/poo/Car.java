package ads.poo;

public class Car {
  // properties
  private int currentSpeed;
  private int maxSpeed;

  // methods
  public void accelerate(int increment) {

    currentSpeed = Math.min(currentSpeed + increment, maxSpeed);

  }

  public void brake(int decrement) {
    // 0 min
    if (currentSpeed - decrement >= 0) {
      currentSpeed -= decrement;
    } else {
      currentSpeed = 0;
    }
  }

  public void setMaxSpeed(int speed) {
    maxSpeed = speed;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

}