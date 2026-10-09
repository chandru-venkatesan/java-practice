package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {
    static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Song:");
        System.out.println("2.Remove song:");
        System.out.println("3.Display PlayList:");
        System.out.println("4.Shuffle PlayList:");
        int choice = sc.nextInt();
        if(choice==1) {
            arr.add("SkyFall");
            System.out.println("Enter Song Name: " + arr);
            System.out.println("Song added to Playlist.");
        }
        else if(choice==1) {
            arr.remove("SkyFall");
            System.out.println("Song Removed from PlayList.");
        } else if (choice==3) {
            System.out.println("Display PlayList: ");
        }
        else{
                System.out.println("Songs Shuffled successfully");
        }
    }
}
