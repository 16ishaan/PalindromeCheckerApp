import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {   public static void main(String[] args) {

    // Application Header
    System.out.println("==============================================");
    System.out.println("        Palindrome Checker App               ");
    System.out.println("==============================================");
    System.out.println("UC6: Queue + Stack Based Palindrome Check");
    System.out.println();

    // Accept user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word to check: ");
    String input = scanner.nextLine();

    // Create Stack (LIFO) and Queue (FIFO)
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    // Enqueue and Push characters
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        stack.push(ch);     // LIFO
        queue.add(ch);      // FIFO
    }

    // Compare dequeue (queue) and pop (stack)
    boolean isPalindrome = true;

    while (!stack.isEmpty()) {
        if (stack.pop() != queue.remove()) {
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
