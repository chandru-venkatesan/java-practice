package course.basic;

public class FeeCalculator {
    public double calculateFee(Course c){
        return c.price;
    }
    public double calculateFee(Course c,double discountPercentage){
        return c.price = (c.price*discountPercentage/100);
    }
}
