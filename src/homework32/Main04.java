package homework32;

import java.util.Scanner;

public class Main04 {

  public static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        System.out.println("Array ne otsortirovan");
      } else {
        System.out.println("Array otsortirovan");
      }
    }

  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size array");
    int size = scanner.nextInt();
    System.out.println("Enter array");
    for (int i = 0; i < size; i++) {
      int[] arr = new int[scanner.nextInt()];
      sort(arr);

    }
  }


}