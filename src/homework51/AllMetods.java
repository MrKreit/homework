package homework51;

import static java.lang.Character.toUpperCase;

import java.util.Arrays;

public class AllMetods {

  public static class Main01 {
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

  public static class Main02 {
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

  public static class Main03 {

    public static byte[] parseIp(String ip) {
      String[] bytesStr = ip.split("\\.");
      if (bytesStr.length != 4) {
        throw new IllegalArgumentException("Ip should consist of onumbers!");
      }
      byte[] bytes = new byte[4];
      for (int i = 0; i < bytes.length; i++) {
        int val;
        try {
          val = Integer.parseInt(bytesStr[i]);
        } catch (NumberFormatException e) {
          throw new IllegalArgumentException(e);
        }
        if (val < 0 || val > 255) {
          throw new IllegalArgumentException("Numbers should be in range 0...255");
        }
        bytes[i] = (byte) (val - 128);
      }
      return bytes;


    }
    public static void main(String[] args) {
      System.out.println(Arrays.toString(parseIp("192.168.0.1")));
    }


  }

  public static class Main04 {
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

  public static class Main05 {
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

  public static class Main06 {

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

  public static class Main07 {
  /* boolean isEmail(String text);
  Проверяет, является ли строка text адресом электронной почты
  и возвращает истину, если это так.

   Для выполнения этого задания нужно будет использовать regex
   */

    public static boolean isEmail(String email) {
      return email.matches("[a-zA-Z)-9._]+(\\+[a-zA-Z)-9._]+)?@[a-zA-Z)-9._]+");

    }

    public static void main(String[] args) {

      System.out.println(isEmail("direct64_p.l@gmail.com"));

    }
  }

  public static class Main08 {
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

  public static class Main09 {
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

  public static class Main10 {
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
}
