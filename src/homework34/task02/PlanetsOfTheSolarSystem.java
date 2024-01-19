package homework34.task02;

public enum PlanetsOfTheSolarSystem {
  MERCURY(654, 54),
  VENUS(7685, 7654),
  EARTH("Earth"),
  MARS("Mars"),
  JUPITER("Jupiter"),
  SATURN("Saturn"),
  URANUS("Uranus"),
  NEPTUNE("Neptune");


  public String name;
  public long mass;
  public int radius;

  PlanetsOfTheSolarSystem(String name) {
    this.name = name;
  }
  //this.mass = mass;
  // this.radius = radius;

  PlanetsOfTheSolarSystem(long mass, int radius) {
    this.mass = mass;
    this.radius = radius;
  }

}
