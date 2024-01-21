package homework51;

public class Main01 {

  /*
  boolean isPalindrome(String word);
 Проверяет, является ли строка word палиндромом
 */
  public static boolean isPalindrome(String word) {
    String lowerCaseWord = word.toLowerCase();
    String reversdWord = new StringBuilder(lowerCaseWord).reverse().toString();
    return lowerCaseWord.equals(reversdWord);
  }

  public static void main(String[] args) {
    String w1 = "Tenet";
    String w2 = "hello";

    System.out.println(w1 + " is a palindrome: " + isPalindrome(w1));
    System.out.println(w2 + " is a palindrome: " + isPalindrome(w2));
  }
}
