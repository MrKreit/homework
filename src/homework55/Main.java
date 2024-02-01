package homework55;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    System.out.println("Enter the work:");
    // считываем строку
    String s = scanner.next();
    while (!s.equals("end")) {
      System.out.println("Enter the time in minutes:");
      // считываем число
      int n = scanner.nextInt();
      // добавляем в HashMap
      map.put(s, n);
      System.out.println("Enter the work or end:");
      s = scanner.next();
    }
    // закрываем Scanner
    scanner.close();
    // выводим HashMap на экран
    for (var entry : map.entrySet()) {
      System.out.println("Work: " + entry.getKey() + ", Time: " + entry.getValue() + " min");

    }
    int sum = 0;
    for (int value : map.values()) {
      sum += value;
    }
    System.out.println("Total time: " + sum + " min");

    int count = map.size();// получаем количество ключей в HashMap
    System.out.println("Amount of all work: " + count);


  }
}
