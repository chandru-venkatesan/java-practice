package streams_lambda_expressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CartMain {
    static void main(String[] args) {
        List<Cart> details = Arrays.asList(new Cart("Wireless Earbuds",599),
                new Cart("Laptop Satnd",359),
                new Cart("Mechanical Keyboard",1299),
                new Cart("Smart Watch",1999));

        details.stream().sorted(Comparator.comparing(Cart::getPrice).reversed()).forEach(c-> System.out.println(c.getItem()+" Rs. "+ c.getPrice()));
    }
}
