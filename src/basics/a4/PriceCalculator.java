package basics.a4;

public class PriceCalculator {
        public static int calculateTotal(int[] arr, int index) {
            if (index == arr.length) {
                return 0;
            } else {
                return arr[index] + calculateTotal(arr, index + 1);
            }

        }

        public static void main(String[] args) {
            int[] prices = {100, 500, 200, 350, 600, 400};
            int totalbill = calculateTotal(prices, 0);
            System.out.println("Total Bill is " + totalbill);
        }

    }

