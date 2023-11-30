package task02;

public enum PlanetsOfTheSolarSystem {
  MERCURY("Mercury"),
  VENUS("Venus"),
  EARTH( "Earth"),
  MARS("Mars"),
  JUPITER("Jupiter"),
  SATURN("Saturn"),
  URANUS("Uranus"),
  NEPTUNE("Neptune");

  private String name;
  private long mass;
  private int  radius;

  PlanetsOfTheSolarSystem(String name) {// long mass, int radius
    this.name = name;
   // this.mass = mass;
   // this.radius = radius;
  }
}
