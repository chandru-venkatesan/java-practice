package java.basics;

public class Customer {
    String customerName;
    int accountNumber;
    Bank bank;

    Customer(String customerName,int accountNumber,Bank bank){
        this.customerName=customerName;
        this.accountNumber = accountNumber;
        this.bank=bank;
    }

    void displayCustomerDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Account Number: "+accountNumber);
        bank.displayBankDetails();
    }

    static void main(String[] args) {
        Bank b=new Bank("SBI",12455);
        Customer c=new Customer("Cristina",194964,b);
        c.displayCustomerDetails();
    }
}
