package multiple_inheritance_using_interfaces_1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Chice:");
        System.out.println("1.WiFi");
        System.out.println("2.Voice Command");
        int choice = sc.nextInt();
        SmartSpeaker SS = new SmartSpeaker() ;
        if(choice==1){
            SS.connectToWiFi();
        } else if (choice==2) {
           SS.activateVoiceCommand();
        }
        else{
            System.out.println("Invalid Option");
        }

    }
}
