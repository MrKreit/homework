package homework51;

public class Main05 {
  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();
    for (char ch : data.toCharArray()) {
      sb.append((char) (ch - 3));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(decrypt("Khoor#zruog"));
  }
}
