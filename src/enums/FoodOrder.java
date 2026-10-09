package enums;

public class FoodOrder {
    void selectCategory(FoodCategory category){
        System.out.println("Available "+category+" : ");
        switch (category){
            case STARTER:
                System.out.println("Soup");
                System.out.println("Salad");
                System.out.println("Chips");
                break;

            case MAIN_COURSE:
                System.out.println("Biryani");
                System.out.println("Fried Rice");
                System.out.println("Noodles");
                break;

            case DESSERT:
                System.out.println("Icecream");
                System.out.println("Cake");
                System.out.println("Chocolate");
                break;

            case BEVERAGE:
                System.out.println("Coke");
                System.out.println("Tea");
                System.out.println("Coffee");
                break;
        }
    }
}
