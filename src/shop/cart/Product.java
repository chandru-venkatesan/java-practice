package shop.cart;

public class Product {
    public Review review;
    String name;
    double price;
    String category;
    Product(String name,double price,String category){
        this.name= name;
        this.price=price;
        this.category=category;
    }

    double getFinalPrice() {
        return price;
    }

    class Review{
        double rating;
        String comment;
        Review(double rating,String comment){
            this.rating=rating;
            this.comment=comment;
        }
        void printReview(){
            System.out.println("Rating is "+rating);
            System.out.println("Comment: "+comment);
        }
    }
}
