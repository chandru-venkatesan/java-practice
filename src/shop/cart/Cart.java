package shop.cart;

public class Cart {
    private Product[] items = new Product[20];
    private int index = 0;

    public void addToCart(Product p) {
        items[index++] = p;
        System.out.println(p.name + " added to cart.");
    }

    public void addToCart(Product[] products) {
        for (Product p : products) {
            if (p != null) {
                items[index++] = p;
                System.out.println(p.name + " added to cart.");
            }
        }
    }

    public void showCart() {
        System.out.println(" CART ITEMS:");
        for (Product p : items) {
            if (p != null) {
                System.out.println(p.name + " - Final Price: ₹" + p.getFinalPrice());
            }
        }
    }

    public double getTotal() {
        double sum = 0;
        for (Product p : items) {
            if (p != null) {
                sum = sum + p.getFinalPrice();
            }
        }
        return sum;

}
}
