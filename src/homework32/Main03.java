package homework32;

import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Enter to number from 1 to 10");
    int number;
    do {
      System.out.println("Enter to number from 1 to 10");
      number = scanner.nextInt();
    }
    while (number < 0 || number > 10);
    System.out.println("You have entered a number: " + number + "." + " Thank you.");

  }

}
