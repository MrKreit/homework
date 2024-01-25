package homework51;

public class Main04 {
  public static String encrypt(String text) {
    StringBuilder sb = new StringBuilder();
    for (char ch : text.toCharArray()) {
      sb.append((char) (ch + 3));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(encrypt("Hello world"));
  }

}
