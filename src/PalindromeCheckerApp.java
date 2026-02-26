import java.util.Stack;
import java.util.Scanner;
public class PalindromeCheckerApp {  public static void main(String[] args) {

    // Application Header
    System.out.println("======================================");
    System.out.println("        Palindrome Checker App        ");
    System.out.println("======================================");
    System.out.println("UC5: Stack-Based Palindrome Checker");
    System.out.println();

    // Accept user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String input = scanner.nextLine();

    // Create stack
    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    // Pop characters and compare
    boolean isPalindrome = true;
    for (int i = 0; i < input.length(); i++) {
        char poppedChar = stack.pop();
        if (input.charAt(i) != poppedChar) {
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
