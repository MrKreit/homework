package homework51;

public class Main01 {
  public static boolean isPalindrome(String word) {
    String lowerCaseWord = word.toLowerCase();
    String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
    return lowerCaseWord.equals(reversedWord);
  }

  public static void main(String[] args) {
    String word1 = "Tenet";
    String word2 = "hello";
    String word3 = "12.21";

    System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
    System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
    System.out.println(word3 + " is a palindrome: " + isPalindrome(word3));
  }

}
