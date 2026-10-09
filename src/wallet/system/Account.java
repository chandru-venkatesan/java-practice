package wallet.system;

public abstract class Account {
   protected String accountNumber;
   protected String accountHolderName;

   public Account(String accountNumber,String accountHolderName){
       this.accountNumber = accountNumber;
       this.accountHolderName=accountHolderName;
   }



   public abstract  void accountDetails();

}
