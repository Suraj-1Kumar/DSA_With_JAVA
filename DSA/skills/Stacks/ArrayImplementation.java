package DSA.skills.Stacks;

import java.util.InputMismatchException;
import java.util.Scanner;

class StackArray{
    private int[] arr;
    private int idx = 0;

    public StackArray(int size) {
        this.arr = new int[size];
    }

    void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow! Cannot push element.");
            return;
        }

        arr[idx] = x;
        idx++;
    }

    int pop(){
        if(idx == 0){
            System.out.println("Stack is empty!");
            return -1;
        }

        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }

    int peek(){
        if(idx == 0){
            System.out.println("Stack is empty!");
            return -1;
        }

        return arr[idx-1];
    }

    boolean isEmpty(){
        if(idx == 0) return true;
        else return false;
    }

    boolean isFull(){
        if(idx == arr.length) return true;
        else return false;
    }

    int size(){
        return idx;
    }

    void display(){
        for(int i = 0; i < idx; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class ArrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = sc.nextInt();
        StackArray st = new StackArray(stackSize);

        System.out.println("Enter numbers to push onto the stack (type -1 to stop):");

        //input loop ---
        while (true) {
            try{
                int x = sc.nextInt();
                if (x == -1) {
                    break;
                }
                st.push(x);
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                sc.next();
            }    
        }

        /*st.push(4);
        st.push(5);
        st.push(1); */
        System.out.println("Original stack");
        st.display();
        System.out.println("Size of stack: " + st.size());

        System.out.println("Peek element of stack: " + st.peek());

        System.out.println("Pop element of stack: " + st.pop());

        st.display();
        System.out.println(st.size());


        sc.close();
    }
}
