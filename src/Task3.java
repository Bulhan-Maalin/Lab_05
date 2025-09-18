import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = "";

        System.out.println("Please enter your party affiliation. Enter a R for republican, D for Democrat, or I for independent:");
        userInput = scan.nextLine();

        if (userInput.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (userInput.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (userInput.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("Error - Invalid Input");
            System.exit(0);
        }

    }
}



