package homework51;

public class Main08 {
  /*
 Разворачивает строку text. Например, строка Hello world должна быть превращена в dlrow olleH
  */
  public static String reverse(String text) {
    StringBuilder reversed = new StringBuilder();
    for (int i = text.length() - 1; i >= 0; i--) {
      reversed.append(text.charAt(i));
    }
    return reversed.toString();
  }

  public static void main(String[] args) {
    String text = "Hello world";
    String reversed = reverse(text);
    System.out.println("Original string: " + text);
    System.out.println("Reversed string: " + reversed);
  }

}
