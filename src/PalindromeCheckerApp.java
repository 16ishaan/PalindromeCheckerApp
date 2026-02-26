import java.util.Scanner;
public class PalindromeCheckerApp {  public static void main(String[] args) {

    // Application Header
    System.out.println("======================================");
    System.out.println("        Palindrome Checker App        ");
    System.out.println("======================================");
    System.out.println("UC3: Palindrome Check Using String Reverse");
    System.out.println();

    // Accept user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String original = scanner.nextLine();

    // Reverse string using for loop
    String reversed = "";
    for (int i = original.length() - 1; i >= 0; i--) {
        reversed = reversed + original.charAt(i);
    }

    // Compare original and reversed string
    if (original.equals(reversed)) {
        System.out.println("The word \"" + original + "\" is a Palindrome.");
    } else {
        System.out.println("The word \"" + original + "\" is NOT a Palindrome.");
    }

    scanner.close();
}
}
