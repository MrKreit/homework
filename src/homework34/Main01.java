package homework34;

import java.util.Scanner;

public class Main01 {

  public static String monthsBySeasons(String name) {
    switch (name) {
      case "december":
      case "january":
      case "february":
        return "Winter";
      case "march":
      case "april":
      case "may":
        return "Spring";
      case "june":
      case "july":
      case "august":
        return "Summer";
      case "september":
      case "october":
      case "november":
        return "Autumn";
      default:
        break;
    }
    return ("You have entered incorrect data!");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nameMonth = scanner.nextLine();
    monthsBySeasons(nameMonth);
    System.out.println("This month refers to the season: " + monthsBySeasons(nameMonth));
  }
}
