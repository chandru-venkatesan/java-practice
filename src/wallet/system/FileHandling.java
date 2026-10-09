package wallet.system;

import java.io.*;
import java.util.List;

public class FileHandling {

    public static void saveTransactions(List<Transaction> transactions){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("transaction.txt"))){
            for(Transaction t: transactions){
                bw.write(t.getType()+","+t.getAmount()+","+t.getCategory()+","+t.getMode()+","+t.getTimeStamp());
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void readTransactions() {
        try (BufferedReader br = new BufferedReader(new FileReader("transactions.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

