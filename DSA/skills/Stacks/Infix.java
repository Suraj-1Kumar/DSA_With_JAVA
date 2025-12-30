package DSA.skills.Stacks;

import java.util.Stack;

public class Infix {
    public static void precedence(String str){
        int n = str.length();
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch - '0');
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '('){
                op.push(ch);
            } 
            else if(ch == ')'){
                while(op.peek() != '('){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek() == '+') val.push(val1+val2);
                    else if(op.peek() == '-') val.push(val1 - val2);
                    else if(op.peek() == '*') val.push(val1 * val2);
                    else if(op.peek() == '/') val.push(val1 / val2);

                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch == '+' || ch == '-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek() == '+') val.push(val1+val2);
                    else if(op.peek() == '-') val.push(val1 - val2);
                    else if(op.peek() == '*') val.push(val1 * val2);
                    else if(op.peek() == '/') val.push(val1 / val2);

                    op.pop();
                    op.push(ch);
                }

                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek() == '+') val.push(val1+val2);
                        else if(op.peek() == '-') val.push(val1 - val2);
                        else if(op.peek() == '*') val.push(val1 * val2);
                        else if(op.peek() == '/') val.push(val1 / val2);

                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }   
        }
        while(op.size() > 0){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek() == '+') val.push(val1+val2);
            else if(op.peek() == '-') val.push(val1 - val2);
            else if(op.peek() == '*') val.push(val1 * val2);
            else if(op.peek() == '/') val.push(val1 / val2);

            op.pop();
        }
        System.out.println(val.peek());
    }
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        precedence(str);
    }
}
