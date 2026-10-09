package basics.a1;

public class GymAttendance {
    public static int calculateTotal(int[] attendance){
        int total =0;
         for(int count:attendance){
             total=total+count;
         }
         return total;
    }
    public static double calculateAverage(int total){
        return total/7.0;
    }

    public static void main(String[] args) {
        int[] attendance={20,10,20,24,22,18,16};
        int total = calculateTotal(attendance);
        double Average = calculateAverage(total);
        System.out.println("Total Attendance :"+ total);
        System.out.println("Average: "+ Average);
    }
}
