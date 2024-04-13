public class Palindrome {
    public static void main(String[] args) {
        // You can test the isPalindrome method here if needed
    }

    public static boolean isPalindrome(String str) {
        // Initialize a stack and a queue
        Stack<String> s = new MyStack<>();
        Queue<String> q = new MyQueue<>();

        // Define legal characters
        String legal = "abcdefghijklmnopqrstuvwxyz";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i + 1);
            String lowerCaseLetter = letter.toLowerCase();

            // Check if the letter is a legal character
            if (legal.indexOf(lowerCaseLetter) > -1) {
                // Add the letter to both the stack and the queue
                s.push(lowerCaseLetter);
                q.add(lowerCaseLetter);
            }
        }

        // Compare elements popped from the stack and dequeued from the queue
        while (!s.isEmpty() && !q.isEmpty()) {
            if (!s.pop().equals(q.remove())) {
                return false; // If characters don't match, it's not a palindrome
            }
        }

        // If both stack and queue are empty, it's a palindrome
        return s.isEmpty() && q.isEmpty();
    }
}
