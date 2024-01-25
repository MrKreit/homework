package homework51;

public class Main06 {

  /*
  int countOccurencies(String text, char letter);
    Считает сколько раз символ letter появляется в строке text и возвращает это число.
    Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.
   */
  public static int countOccurencies(String text, char letter) {
    if (text == null || text.isEmpty()) {
      return 0;
    }
    int letterCounter = 0;
    char[] temp = text.toCharArray();
    for (char c : temp) {
      if (letter == c) {
        letterCounter++;
      }
    }
    return letterCounter;
  }

  public static void main(String[] args) {
    System.out.println(countOccurencies("Nice to meet you", 'e'));

  }

}
