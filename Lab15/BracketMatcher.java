public class BracketMatcher {
    public static void main(String[] args) {
        // You can test the matchBrackets method here if needed
    }

    public static String matchBrackets(String str) {
        // Initialize a stack
        Stack<String> stack = new MyStack<>();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            String bracket = str.substring(i, i + 1);

            // Check if the character is a left bracket
            if ("[{(".contains(bracket)) {
                // Push left brackets onto the stack
                stack.push(bracket);
            } else if ("]})".contains(bracket)) {
                // Check for matching right brackets
                if (stack.isEmpty()) {
                    return "Too many closing brackets";
                }

                String popped = stack.pop();

                // Check if the popped left bracket matches the current right bracket
                if ((popped.equals("(") && !bracket.equals(")")) ||
                        (popped.equals("[") && !bracket.equals("]")) ||
                        (popped.equals("{") && !bracket.equals("}"))) {
                    return "Bracket mismatch";
                }
            }
        }

        // Check for unmatched left brackets
        if (!stack.isEmpty()) {
            return "Not enough closing brackets";
        }

        return "Balanced";
    }
}
