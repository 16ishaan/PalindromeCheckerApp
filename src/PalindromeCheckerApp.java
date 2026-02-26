import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {     public static void main(String[] args) {

    // Application Header
    System.out.println("======================================================");
    System.out.println("              Palindrome Checker App                ");
    System.out.println("======================================================");
    System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");
    System.out.println();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence to check: ");
    String input = scanner.nextLine();

    // Step 1: Normalize string
    // Remove spaces and special characters, convert to lowercase
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    // Step 2: Apply palindrome logic (Two-pointer approach)
    boolean isPalindrome = true;
    int start = 0;
    int end = normalized.length() - 1;

    while (start < end) {
        if (normalized.charAt(start) != normalized.charAt(end)) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    // Display result
    if (isPalindrome) {
        System.out.println("The given sentence is a Palindrome (ignoring case & spaces).");
    } else {
        System.out.println("The given sentence is NOT a Palindrome.");
    }

    scanner.close();
}
}
