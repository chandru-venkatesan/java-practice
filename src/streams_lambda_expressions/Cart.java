package streams_lambda_expressions;

public class Cart {
    String item;
    int price;

    Cart(String item,int price){
        this.item = item;
        this.price = price;
    }

    String getItem(){
        return item;
    }
    int getPrice(){
        return price;
    }
}
