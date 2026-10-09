package wallet.system;

import java.time.LocalDate;

public class Transaction {
    private TransactionType type;
    private double amount;
    private PaymentMode mode;
    private String category;
    private LocalDate timeStamp;

    public Transaction(TransactionType type,double amount,PaymentMode mode,String category){
        this.type=type;
        this.amount=amount;
        this.mode=mode;
        this.category=category;
        this.timeStamp=LocalDate.now();
    }

    public TransactionType getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public PaymentMode getMode(){
        return mode;
    }
    public String getCategory(){
        return category;
    }
    public LocalDate getTimeStamp(){
        return timeStamp;
    }

    @Override
    public String toString() {
        return timeStamp + " | " + type + " | " + amount + " | " + mode+ " | "+ category;
    }
}
