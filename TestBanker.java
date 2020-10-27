public class TestBanker{
  public static void main(String[] args) {
    BankAccount acc1 =new BankAccount(5213452, "jajwuth");
    System.out.println(acc1.getBalance());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.deposit(20));
    System.out.println(acc1.getBalance());
    System.out.println(acc1.withdraw(15));
    System.out.println(acc1.withdraw(10));
    System.out.println(acc1.toString());
  }
}
