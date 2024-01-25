package homework51;

public class Main07 {
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
