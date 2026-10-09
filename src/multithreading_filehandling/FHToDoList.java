package multithreading_filehandling;

import java.io.File;
import java.io.FileWriter;

public class FHToDoList {
    static void main(String[] args) {
        try{
            File f = new File("gitassignment.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("1.Complete Java assignment\n");
            fw.write("2.Submit Resume\n");
            fw.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
