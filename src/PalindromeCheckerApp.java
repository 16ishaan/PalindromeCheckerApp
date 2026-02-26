import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {      // Public method exposed to clients
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Application class (Entry Point)
 class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("================================================");
        System.out.println("           Palindrome Checker App              ");
        System.out.println("================================================");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String input = scanner.nextLine();

        // Create object of service class
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
}
}
