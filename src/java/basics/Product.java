package java.basics;

public class Product {
    String productName;
    double price;
    int quantity;

    void displayProduct(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }

    static void main(String[] args) {
        Product obj1 = new Product();
        obj1.productName="Mobile Phone";
        obj1.price=20000.00;
        obj1.quantity=10;
        obj1.displayProduct();

        Product obj2 = new Product();
        obj2.productName="Laptop";
        obj2.price=50000.00;
        obj2.quantity=20;
        obj2.displayProduct();


    }
}
