package arraylist_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class BrowserHistory {
    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Visit Website");
        System.out.println("2.Go Back");
        System.out.println("3. Show History");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Enter Website: ");
            sc.nextLine ();
            ll.add(sc.nextLine ());
            System.out.println(ll+" added to history");
        }
        else if (choice ==2) {
            ll.remove("google.com");
        }
        else if (choice==3) {
            System.out.println(ll);
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
