package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendanceSystem {
    static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        arr.add("Meredith");
        arr.add("Jack");
        arr.add("Derek");
        System.out.println("1.Mark Present");
        System.out.println("2.Mark Absent");
        System.out.println("3.Display Present Students");
        int choice = sc.nextInt();
           if(choice==1) {
               System.out.println("Enter Student name:");
               sc.nextLine();
               arr.add(sc.nextLine());
               System.out.println(arr);
           } else if (choice == 2) {
               System.out.println("Enter Student name:");
               sc.nextLine();
               arr.remove(sc.nextLine());
               System.out.println(arr);
           } else if (choice==3) {
               System.out.println("Present Students: "+ arr);
           }
        }
    }

