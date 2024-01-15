package homework46;

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] array = new double[10];
    double sum = 0;
    int index = 0;
    //double number;

//while (true) {
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextDouble();
      sum += array[i];
      index++;

      if (array[i] == 0) {
        break;
      }

    }
    double average = sum / index;

    for (int i = 0; i < array.length; i++) {
      System.out.print("[" + i + "]" + array[i] + ", ");
    }
    System.out.println("\n" + average);

  }
}

