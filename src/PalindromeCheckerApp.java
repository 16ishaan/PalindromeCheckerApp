import java.util.Scanner;
public class PalindromeCheckerApp {  public static void main(String[] args) {

    // Application Header
    System.out.println("======================================");
    System.out.println("        Palindrome Checker App        ");
    System.out.println("======================================");
    System.out.println("UC4: Character Array Based Palindrome Check");
    System.out.println();

    // Accept user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String input = scanner.nextLine();

    // Convert String to char array
    char[] characters = input.toCharArray();

    // Two-pointer technique
    int start = 0;
    int end = characters.length - 1;
    boolean isPalindrome = true;

    while (start < end) {
        if (characters[start] != characters[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
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
