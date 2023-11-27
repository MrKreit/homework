package homework29;

public class TraficLight {

  private ColorTrafficLight currentTrafficLight;

  public TraficLight(ColorTrafficLight currentTrafficLight) {
    this.currentTrafficLight = currentTrafficLight;
  }

  public ColorTrafficLight getColor() {
    return currentTrafficLight;
  }

  public void setColor(ColorTrafficLight currentTrafficLight) {
    this.currentTrafficLight = currentTrafficLight;
  }

  public static boolean canCrossTheRoad(String color) {
    if (color.equals("GREEN")) {
      return true;
    } else {
      return false;
    }
  }
}
