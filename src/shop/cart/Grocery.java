package shop.cart;

public class Grocery extends Product {
    Grocery(String name, double price, String category) {
        super(name, price, category);
    }
    @Override
    double getFinalPrice() {
        return price+(price*(5)/100);
    }
}
