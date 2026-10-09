package wallet.system;

import java.util.List;

public class ExpenseCalculator {
    public static double totalExpense(List<Transaction> transactions, int index){
        if(index== transactions.size()) return 0;
        double amount =0.0;
        if(transactions.get(index).getType()==TransactionType.DEBIT){
            amount = transactions.get(index).getAmount();
        }

        return amount + totalExpense(transactions,index+1);
    }
}
