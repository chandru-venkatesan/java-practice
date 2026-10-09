package hosital.management;

public  class Doctor extends Person{
    Department department;
Schedule schedule;
    class Schedule{
        String day;
        String time;
        Schedule(String day, String time){
            this.day=day;
            this.time=time;
        }

        void printSchedule() {
            System.out.println("Scheduled on "+ day+ "at "+ time);
        }
    }
    public Doctor(String name,int age, Department department, String day, String time){
        super(name,age);
        this.department=department;
        this.schedule=new Schedule(day,time);


    }

    @Override
   public void showInfo() {
System.out.println("Doctor Details");
System.out.println("Doctor's Name: "+name);
System.out.println("Doctor's Age: "+age);
System.out.println("Department: "+department);
schedule.printSchedule();
    }
}
