package homework52;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import homework51.*;
import org.junit.Test;


public class Homework51Test {

  @Test
  public void testIsPalindrome() {
    String w1 = "Tenet";
    String w2 = "Hello";
    //String w3 = "Pilip";
    //String w4 = "Home";
    boolean actual = Main01.isPalindrome(w1);
    assertTrue(actual);
    boolean actual1 = Main01.isPalindrome(w2);
    assertFalse(actual1);


  }
}
