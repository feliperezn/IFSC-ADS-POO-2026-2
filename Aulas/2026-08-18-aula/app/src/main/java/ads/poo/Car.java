package ads.poo;

public class Car {
  // properties
  private int currentSpeed;
  private int maxSpeed;
  
  // methods
  public void accelerate(int increment){

    currentSpeed += increment;
    
    if (currentSpeed > maxSpeed) {
      currentSpeed = maxSpeed;
    }
    
  }

  public void setMaxSpeed(int speed){
    maxSpeed = speed;
  }

  public int getCurrentSpeed(){
    return currentSpeed;
  }


}