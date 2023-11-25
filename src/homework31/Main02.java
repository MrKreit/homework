package homework31;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int choise = scanner.nextInt();
    if (choise == 1) {
      int cub1 = random.nextInt(6 - 1 + 1) + 1;
      System.out.println("On the cub dropped the values: " + cub1);

    } else if (choise == 2) {
      int cub2 = random.nextInt(6 - 1 + 1) + 1;
      int cub1 = random.nextInt(6 - 1 + 1) + 1;
      System.out.print("On the cubes dropped the values: " + cub1 + " " + cub2);
    } else {
      System.out.println("You entered the wrong number of cubes");

    }

  }
}
