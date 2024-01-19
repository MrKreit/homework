package homework47;

import java.util.Scanner;

public class Main {

  /*
  Сделать симуляцию кассы, где пользователь пишет название продукта и получает его цену
  */
  /*давайте объединим их в один массив для наименований и цен
Для этого создайте обобщенный класс Pair с двумя обобщенными типами (записать через запятую).
Естественно, что нужно будет создать два поля этих типов и определить для них аксесоры чтобы пользоваться классом.
После этого, переписать код таким образом, чтобы был один массив типа Pair<String, Double>
*/

  public static void main(String[] args) {

    Pair<String, Double>[] products = new Pair[] {
        new Pair<>("Яблоко", 2.0),
        new Pair<>("Картошка", 1.5),
        new Pair<>("Огурец", 2.5),
        new Pair<>("Помидор", 3.0),
        new Pair<>("Лук", 1.0),
        new Pair<>("Виноград", 3.5),
    };
    // делаем массивы с данными
    //String[] products = {"Яблоко", "Картошка", "Огурец", "Помидор", "Лук", "Виноград"};
    //double[] prices = {2, 1.5, 2.5, 3, 1, 3.5};

    Scanner scanner = new Scanner(System.in);
    String userChoice = scanner.nextLine();
    int index = -1;
    /* ищем по размеру массива цен, но сравниваем названия продуктов
     Очевидно, работает это только если массивы одинакового размера
     Делать так можно только если массивы тесно связаны, как в нашем случае,
     это наименования и цены
     */
    for (int i = 0; i < products.length; i++) {
      if (userChoice.equals(products[i].getFirst())) {
        index = i;
        break;
      }
    }
    // индекс найденного продукта используем для того чтобы
    if (index != -1) {
      System.out.println(products[index].getSecond());
    } else {
      System.out.println("Товара " + userChoice + " нет в магазине");
    }

  }

}
