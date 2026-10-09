package basics.a1;

import java.util.Scanner;

public class SuperMarket {
    public static void printBill(String[] items, int[] quantities, double[] prices) {
        double grandtotal = 0;
        double Total = 0;
        for (int i = 0; i < items.length; i++) {
            Total = quantities[i] * prices[i];
            grandtotal = grandtotal + Total;
            System.out.println(items[i] + " " + quantities[i] + " " + prices[i] + " " + Total);
        }
        System.out.println("Final Bill : " + grandtotal);
    }
    public static  void printBill(double total){
        System.out.println("Bill Amount : "+ total);
    }

     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         String[] items = {"Rice","Milk","Bread","Soap","Shampoo"};
         double[] prices ={100,50,60,30,20};
         int [] quantities = new int[5];
         for(int i =0;i<items.length;i++){
             System.out.println("Enter Quantity : "+items[i]);
             quantities[i]=sc.nextInt();
         }
         printBill(items,quantities,prices);
         sc.close();
    }

}
