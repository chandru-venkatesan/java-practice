package scanner_user_input;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessTracker ft =new FitnessTracker();
        System.out.println("Enter Steps Walked:");
        ft.stepsWalked= sc.nextInt();
        System.out.println("Enter workout Minutes:");
        ft.workoutMinutes=sc.nextInt();
        System.out.println("Enter Calories Burned per Minute:");
        ft.caloriesBurnedPerMinute=sc.nextInt();
        ft.calculateTotalCalories();
    }
}
