import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Please enter the number of your birth month:");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
        } else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth + ".");
        } else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }
    }
}