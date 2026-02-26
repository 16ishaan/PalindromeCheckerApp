import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {   public static void main(String[] args) {

    // Application Header
    System.out.println("================================================");
    System.out.println("           Palindrome Checker App              ");
    System.out.println("================================================");
    System.out.println("UC7: Deque-Based Optimized Palindrome Checker");
    System.out.println();

    // Accept user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String input = scanner.nextLine();

    // Create Deque
    Deque<Character> deque = new ArrayDeque<>();

    // Insert characters into deque
    for (int i = 0; i < input.length(); i++) {
        deque.addLast(input.charAt(i));
    }

    // Compare front and rear elements
    boolean isPalindrome = true;

    while (deque.size() > 1) {
        char front = deque.removeFirst();
        char rear = deque.removeLast();

        if (front != rear) {
            isPalindrome = false;
            break;
        }
    }

    // Display result
    if (isPalindrome) {
        System.out.println("The word \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
    }

    scanner.close();
}
}
