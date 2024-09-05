import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Initialize an empty string to store the reversed version
        String reversed = "";

        // Reverse the original string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check if the original string is equal to its reversed version
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
