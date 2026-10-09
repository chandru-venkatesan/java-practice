package java.basics;

public class Bank {
    String bankName;
    int branchCode;

    Bank(String bankName, int branchCode){
        this.bankName = bankName;
        this.branchCode= branchCode;
    }

     void displayBankDetails(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Branch Code: "+ branchCode);
    }
}
