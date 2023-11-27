package homework29;

public class Main {

  public static void main(String[] args) {
   TraficLight traficLight = new TraficLight(ColorTrafficLight.GREEN);
  // traficLight.setColor("GREEN");
  // TraficLight.canCrossTheRoad("GREEN");
    System.out.println(TraficLight.canCrossTheRoad("GREEN"));

  }
}
