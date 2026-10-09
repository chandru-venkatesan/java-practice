package scanner_user_input;

public class FitnessTracker {
    int stepsWalked;
    int workoutMinutes;
    int caloriesBurnedPerMinute;
    void calculateTotalCalories(){
        int totalCaloriesBurned = workoutMinutes*caloriesBurnedPerMinute;
        System.out.println("Total Calories Burned: "+totalCaloriesBurned);
    }
}
