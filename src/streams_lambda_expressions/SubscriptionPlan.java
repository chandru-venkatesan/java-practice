package streams_lambda_expressions;

public class SubscriptionPlan {
    String planName;
    int price;
    SubscriptionPlan(String planName,int price){
        this.planName=planName;
        this.price=price;
    }

    String getPlanName(){
        return planName;
    }
    int getPrice(){
        return price;
    }
}
