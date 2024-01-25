package homework51;

public class Main09 {
  /*
  * String wordReverse(String text);
    Разворачивает порядок слов в строке text (слова разделены пробелами).
    Например, для ввода What a wonderful day результат будет day wonderful a What
   */
  public static String reverseWord(String s) {
    StringBuilder sb = new StringBuilder();
    String[] words = s.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]).append(" ");
    }
    return sb.toString().trim();
  }
  public static void main(String[] args) {
    System.out.println(reverseWord("What a wonderful day"));
  }

}
