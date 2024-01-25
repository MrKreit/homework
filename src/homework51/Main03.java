package homework51;

import java.util.Arrays;

public class Main03 {

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
