import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;

        System.out.println("Please enter your age:");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
        }
        else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }

        if (age >= 21) {
            System.out.println("Here is your wristband. Enjoy the movie!");
        }
        else if (age < 21) {
            System.out.println("Enjoy the movie!");
        }
        else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }

    }
}
