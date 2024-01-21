package homework51;

public class Main02 {
  //Проверяет, является ли строка sentence Pangramm

  public static boolean isPangram(String sentences) {
    String lowerCaseSent = sentences.toLowerCase();
    return lowerCaseSent.matches(".*[a-z].*[a-z].*[a-z].*[a-z].*[a-z]"
        + ".*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z]"
        + ".*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*[a-z].*");
  }

  public static void main(String[] args) {
    String sentence1 = "The quick brown fox jumps over the lazy dog";
    String sentence2 = "The quick brown fox";

    System.out.println(sentence1 + "\nIs this sentence  pangram? - "
        + isPangram(sentence1));
    System.out.println(sentence2 + "\nIs this sentence  pangram? - "
        + isPangram(sentence2));
  }
}
