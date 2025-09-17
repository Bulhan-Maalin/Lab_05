import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double itemPrice = 0.0;
        Double totalPrice = 0.0;

        System.out.println("Please enter the price of your purchase:");
        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();
        }
        else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }

        if (itemPrice >= 100) {
            System.out.println("Since your purchase is $" + itemPrice + ", you-1 have free shipping!");
            System.exit(0);
        }
        else {
            System.out.println("Since your purchase is $" + itemPrice + ", you have to pay for shipping as your purchase is under $100.");
            totalPrice = (itemPrice * 0.02) + itemPrice;
            System.out.println("The total price for your purchase is $" + totalPrice + ". Enjoy your item!");
            System.exit(0);
        }


    }
}
