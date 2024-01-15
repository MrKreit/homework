package homework46;

import java.util.Random;
import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Enter size Array: ");
    int sizeArr = scanner.nextInt();
    int[] arr = new int[sizeArr];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 1 + random.nextInt(100 - 1);
    }
    System.out.println("Your array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < arr.length; i++) {
      int min = arr[i];
      int pos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (min < arr[j]) {
          pos = j;
          min = arr[j];
        }
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
      }
    }
    System.out.println("\nSorting array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}
