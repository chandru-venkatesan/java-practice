package shop.cart;

public class Clothing extends Product{
    Clothing(String name, double price, String category) {
        super(name, price, category);
    }
    @Override
    double getFinalPrice() {
        return price+(price*(10)/100);
    }
}
