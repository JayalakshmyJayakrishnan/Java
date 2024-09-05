import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        double num, largest;

        System.out.print("Enter the number of values (N): ");
        N = scanner.nextInt();

        // Initialize 'largest' with the first number entered by the user
        System.out.print("Enter number 1: ");
        largest = scanner.nextDouble();

        // Iterate through the remaining numbers
        for (int i = 2; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scanner.nextDouble();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("The largest number is: " + largest);
        
    }
}
