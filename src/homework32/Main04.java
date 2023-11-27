package homework32;

import java.util.Scanner;

public class Main04 {

  public static void sort(int[] arr) {
    boolean sorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        sorted = false;
        break;
      }
    }
    if (sorted) {
      System.out.println("Array  otsortirovan");
    } else {

      System.out.println("Array nie otsortirovan");
    }
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size array");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter array");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
      sort(arr);

    }
  }


