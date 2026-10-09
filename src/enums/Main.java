package enums;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodOrder obj = new FoodOrder();

        System.out.println("Select Food Category:");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Dessert");
        System.out.println("4. Beverage");

        int choice = sc.nextInt();
        FoodCategory a = null;

        switch (choice){
            case 1:
                a = FoodCategory.STARTER;
                break;
            case 2:
                a = FoodCategory.MAIN_COURSE;
                break;
            case 3:
                a = FoodCategory.DESSERT;
                break;
            case 4:
                a= FoodCategory.BEVERAGE;
                break;
        }

        obj.selectCategory(a);
    }
}
