package arraylist_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {
    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Task");
        System.out.println("2.Remove Task");
        System.out.println("3. Mark Task Completed");
        System.out.println("4.View Pending Tasks");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Enter Task:");
            sc.nextLine();
            ll.add(sc.nextLine());
            System.out.println(ll);
            System.out.println("Task Added");
        }
    }
}
