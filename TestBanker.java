public class TestBanker{
  public static void main(String[] args) {
    //**hw 12 tests*//
    //BankAccount acc1 =new BankAccount(5213452, "jajwuth");
    //System.out.println(acc1.getBalance());
    //System.out.println(acc1.getAccountID());
    //System.out.println(acc1.deposit(20));
    //System.out.println(acc1.getBalance());
    //System.out.println(acc1.withdraw(15));
    //System.out.println(acc1.withdraw(10));
    //System.out.println(acc1.toString());

    BankAccount b1 = new BankAccount(1000001, "abc123");
    BankAccount b2 = new BankAccount(1000231, "abcasdg23");
    System.out.println("Account b1:");
    b1.deposit(3000.0);
    b2.deposit(1234.0);
    System.out.println(b1);
    System.out.println("Account b2:");
    System.out.println(b2);
    System.out.println();
    double cashAmount = 300.0;
    while(cashAmount < 3000){
      System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
      if(b1.withdraw(cashAmount) ){
        if(b2.deposit(cashAmount)){
          System.out.println(b1);
          System.out.println(b2);
          System.out.println();
        }
        else{
          //This should never happen.
          //Error message provided to make sure that is the case
          System.out.println("CRITICAL ERROR! $"+cashAmount +
                             " withdrawn from Account #" + b1.getAccountID() +
                             "Failed to add to Account #"+ b2.getAccountID());
        }
      }
      else{
        System.out.println("Transfer Failed");
      }
      cashAmount *= 2;
    }
    System.out.println(b1.transferTo(b2, 10, "abc123"));
    System.out.println(b1.transferTo(b2, 10, "abc1234"));
    System.out.println(b1.transferTo(b2, 1000, "abc123"));
  }
}
