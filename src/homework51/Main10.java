package homework51;

import static java.lang.Character.toUpperCase;

public class Main10 {
  /*
  String toCamelCase(String text);
    Переводит текст в строке text в идентификатор в стиле lowerCamelCase
    Например, для ввода What a BEAUTIFUL day
     должен получиться результат whatABeautifulDay
   */

  public static String toCamelCase(String text) {
    String[] splitText = text.toLowerCase().split(" " );
    StringBuilder sb = new StringBuilder(splitText[0]);
    for (int i = 1; i < splitText.length; i++) {
      sb.append(toUpperCase(splitText[i].charAt(0))).append(splitText[i].substring(1));
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String text = "this is a sample text";
    String camelCaseText = toCamelCase(text);
    System.out.println(camelCaseText);
  }

}
