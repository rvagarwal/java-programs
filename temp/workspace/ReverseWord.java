package workspace;

import java.util.Stack;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "Today is a good day to learn";
        String[] words = str.split(" ");
        String reversed = getReversedUsingForLoop(words);
        System.out.println(reversed);
        reversed = "";
        reversed = getReversedUsingStack(words);
        System.out.println(reversed);

    }
/**
 * This method reverses the order of words in a given string.
 *
 * @param words An array of strings representing the words in the original string.
 * @return A string with the words in reversed order, separated by a single space.
 */
private static String getReversedUsingForLoop(String[] words) {
    StringBuilder reversed = new StringBuilder();
    // Loop through the words array in reverse order
    for (int i = words.length - 1; i >= 0; i--) {
        // Append each word to the StringBuilder followed by a space
        reversed.append(words[i]).append(" ");
    }
    // Convert the StringBuilder to a string, remove trailing space, and return
    return reversed.toString().trim();
}

/**
 * This method reverses the order of words in a given string using a stack.
 *
 * @param words An array of strings representing the words in the original string.
 * @return A string with the words in reversed order, separated by a single space.
 *
 * The method works by pushing each word from the input array onto a stack.
 * Then, it pops each word from the stack and appends it to a StringBuilder.
 * Finally, it trims any trailing space from the resulting string and returns it.
 */
private static String getReversedUsingStack(String[] words) {
    Stack<String> stack = new Stack<String>();
    for (String word : words) {
        stack.push(word);
    }
    StringBuilder reversed = new StringBuilder();
    while (!stack.isEmpty()) {
        reversed.append(stack.pop()).append(" ");
    }
    return reversed.toString().trim();
}

}