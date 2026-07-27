package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        String reversed_input = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed_input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
