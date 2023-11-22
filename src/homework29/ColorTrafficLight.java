package homework29;

public enum ColorTrafficLight {
  RED("red_fools"),
  YELLOW("yellow_fools"),
  GREEN("green_true");

  private String color;

  ColorTrafficLight(String color) {
    this.color = color;
  }


  public String getColor() {
    return color;
  }

}


