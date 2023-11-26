package homework29;


public class TraficLight {

  private String currentTrafficLight;

  public TraficLight(String currentTrafficLight) {
    this.currentTrafficLight = currentTrafficLight;
  }


  public String getColor() {
    return currentTrafficLight;
  }

  public void setColor(String currentTrafficLight) {
    this.currentTrafficLight = currentTrafficLight;
  }
public static boolean canCrossTheRoad(String color ) {
    if (color.equals("GREEN")) {
      return true;
    } else {
      return false;
    }
}

}














