public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int id, String pass){
    balance=0;
    accountID=id;
    password=pass;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password=newPass;
  }
}
