package javadoc.advanced.exceptions;

public class ExceptionsDemo {
  public static void show() {
    Account account = new Account();
    try {
      account.withdraw(10);
    } catch (AccountException e) {
      Throwable cause = e.getCause();
      System.out.println(cause.getMessage());
    }
  }
}
