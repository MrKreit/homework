package task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public  static List<String> typeAtmosferePlanet(int number) {

    List<String> result = new ArrayList<>();
    switch (number) {
      case 1:
        result.add("Нет атмосферы"  );
        break;
      case 2:
      case 4:
        result.add("Углекислый газ");
        break;
      case 3: result.add("Углекислый газ");
        result.add("Азот");
        result.add("Кислород");
        break;
      case 5:
      case 6: result.add("Водород");
        result.add("Гелий");
        break;
      case 7:
      case 8: result.add("Метан");
        result.add("Водород");
        result.add("Гелий");
        break;
      default:
        break;

    }
    return result;
  }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //PlanetsOfTheSolarSystem[] planet = {PlanetsOfTheSolarSystem.MERCURY, PlanetsOfTheSolarSystem.VENUS, PlanetsOfTheSolarSystem.EARTH,
    //PlanetsOfTheSolarSystem.MARS, PlanetsOfTheSolarSystem.JUPITER, PlanetsOfTheSolarSystem.SATURN, PlanetsOfTheSolarSystem.URANUS,
    //PlanetsOfTheSolarSystem.NEPTUNE};

      PlanetsOfTheSolarSystem[] planet = PlanetsOfTheSolarSystem.values();

      for (int i = 0; i < planet.length ; i++) {
        System.out.println((i + 1) + ". " + planet[i] );
      }
      System.out.println("Choose a number planet: ");
      int number = scanner.nextInt();
      System.out.println(typeAtmosferePlanet(number));
  }

}
