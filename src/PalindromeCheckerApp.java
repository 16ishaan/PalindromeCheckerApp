import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {    public static void main(String[] args) {

    // Application Header
    System.out.println("================================================");
    System.out.println("           Palindrome Checker App              ");
    System.out.println("================================================");
    System.out.println("UC9: Recursive Palindrome Checker");
    System.out.println();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String input = scanner.nextLine();

    boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

    // Display result
    if (isPalindrome) {
        System.out.println("The word \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
    }

    scanner.close();
}

    // Recursive method
    private static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
}
}
