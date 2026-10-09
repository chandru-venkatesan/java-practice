package java.basics;

public class Car {
     String brand;
    String model;
    String year;
    void showDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
    static void main(String[] args) {
         Car obj=new Car();
        obj.brand = "Toyota";
        obj.model = "Camry";
        obj.year = "2022";
        obj.showDetails();
    }
}
