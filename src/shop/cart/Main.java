package shop.cart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("SHOPPING MENU:");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Grocery");
            System.out.println("4. Show Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 6) {
                System.out.println("Thank you! Exiting...");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid option!");
                continue;
            }

            if (choice == 4) {
                cart.showCart();
                continue;
            }

            if (choice == 5) {
                System.out.println(" CHECKOUT");
                cart.showCart();
                double total = cart.getTotal();
                System.out.println("Total Amount: ₹" + total);
                continue;
            }

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Product selectedProduct = null;

            switch (choice) {
                case 1:
                    selectedProduct = new Electronics(name, price, selectedProduct.category);
                    break;

                case 2:
                    selectedProduct = new Clothing(name, price, selectedProduct.category);
                    break;

                case 3:
                    selectedProduct = new Grocery(name, price, selectedProduct.category);
                    break;
            }

            System.out.print("Enter your rating (1 to 5): ");
            double rating = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter comment: ");
            String comment = sc.nextLine();

            selectedProduct.review = selectedProduct.new Review(rating, comment);

            System.out.println("\nProduct Review Added:");
            selectedProduct.review.printReview();


            cart.addToCart(selectedProduct);
        }

        sc.close();
    }
}

