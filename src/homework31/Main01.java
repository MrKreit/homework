package homework31;

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    double res =  a * (b-d) + c * a / d;
    System.out.println(res);
  }

}
