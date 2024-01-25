package homework52;

//import static org.junit.Assert.assertFalse;

import static org.junit.Assert.*;

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

  @Test
  public void testMetodIsPangram() {
    String s = "The quick brown fox jumps over the lazy dog";
    String s1 = "Hello world";
    boolean actual = Main02.isPangram(s);
    assertTrue(actual);
    boolean actual1 = Main02.isPangram(s1);
    assertFalse(actual1);
  }

  @Test
  public void IpParserTest() {
    String ip = "192.168.0.1";
    byte[] expected = {64, 40, -128, -127};
    byte[] actual = Main03.parseIp(ip);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void encryptTest() {
    String text = "Hello world";
    String expected = "Khoor#zruog";
    String actual = Main04.encrypt(text);
    assertEquals(expected, actual);
  }

  @Test
  public void decryptTest() {
    String text = "Khoor#zruog";
    String expected = "Hello world";
    String actual = Main05.decrypt(text);
    assertEquals(expected, actual);
  }

  @Test
  public void countOccurenciesTest() {
    String text = "Nice to meet you";
    char letter = 'e';
    int expected = 3;
    int actual = Main06.countOccurencies(text, letter);
    assertEquals(actual, expected);
  }

  @Test
  public void isEmailTest() {
    String email = "direct64_p.l@gmail.com";
    boolean actual = Main07.isEmail(email);
    assertTrue(actual);
  }

  @Test
  public void reverseTest() {
    String text = "Hello world";
    String expected = "dlrow olleH";
    String actual = Main08.reverse(text);
    assertEquals(expected, actual);

  }

  @Test
  public void wordReverseTest() {
    String text = "What a wonderful day";
    String expected = "day wonderful a What";
    String actual = Main09.reverseWord(text);
    assertEquals(expected, actual);

  }

  @Test
  public void toCamelCaseTest() {
    String text = "What a wonderful day";
    String expected = "whatAWonderfulDay";
    String actual = Main10.toCamelCase(text);
    assertEquals(expected, actual);

  }
}

