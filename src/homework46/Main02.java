package homework46;

import java.util.Scanner;

public class Main02 {

  public static void dayWeek(int numberDay) {

    switch (numberDay) {
      case 1:
        System.out.println("This is Monday " + numberDay + " day in week");
        break;
      case 2:
        System.out.println("This is Tuesday " + numberDay + " day in week");
        break;
      case 3:
        System.out.println("This is Wednesday " + numberDay + " day in week");
        break;
      case 4:
        System.out.println("This is Thursday " + numberDay + " day in week");
        break;
      case 5:
        System.out.println("This is Friday " + numberDay + " day in week");
        break;
      case 6:
        System.out.println("This is Saturday " + numberDay + " day in week");
        break;
      case 7:
        System.out.println("This is Sunday " + numberDay + " day in week");
        break;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberDay = 0;

    while (numberDay < 1 || numberDay > 7) {
      System.out.println("Enter number from 1 to 7");
      numberDay = scanner.nextInt();
    }
    dayWeek(numberDay);


  }
}





