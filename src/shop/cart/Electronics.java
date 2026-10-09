package shop.cart;

public class Electronics extends Product {
    Electronics(String name, double price,String category) {
        super(name, price, category);
    }

    @Override
    double getFinalPrice() {
        return price+(price*(20)/100);
    }
}
