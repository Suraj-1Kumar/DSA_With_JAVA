package DSA.skills.Stacks;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix Expression: " + infix);
        int n = infix.length();
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                String s = "" + ch;
                val.push(s);
            } 
            else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } 
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char o = op.pop(); // FIXED: Changed peek() to pop()
                    String temp = o + val1 + val2;
                    val.push(temp);
                }
                op.pop(); // Pop the '('
            } 
            else {
                // Handling Operators
                if (ch == '+' || ch == '-') {
                    // + and - have lowest precedence, so pop everything (except '(')
                    // FIXED: Changed 'if' to 'while' to handle multiple operators
                    while (op.size() > 0 && op.peek() != '(') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop(); // FIXED: pop() the operator
                        String temp = o + val1 + val2;
                        val.push(temp);
                    }
                    op.push(ch);
                }
                
                if (ch == '*' || ch == '/') {
                    // * and / only pop if top is also * or / (equal precedence)
                    // FIXED: Changed 'if' to 'while'
                    while (op.size() > 0 && (op.peek() == '*' || op.peek() == '/')) {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char o = op.pop(); // FIXED: pop() the operator
                        String temp = o + val1 + val2;
                        val.push(temp);
                    }
                    op.push(ch);
                }
            }
        }
        
        // Clean up remaining operators
        while (op.size() > 0) {
            String val2 = val.pop();
            String val1 = val.pop();
            char o = op.pop(); // FIXED: pop()
            String temp = o + val1 + val2;
            val.push(temp);
        }
        
        System.out.println("Prefix Expression: "+ val.peek());
    }
}