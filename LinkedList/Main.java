package LinkedList;

import java.util.*;

class Node{
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }
}

class LinkedList1{
    Node head;

    public LinkedList1(){
        head = null;
    }

    public Node reverseKGroup(Node head, int k){
        Node temp = head;
        int cnt = 0;

        while(cnt < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            cnt++;
        }

        Node prevNode = reverseKGroup(temp, k);

        temp = head;
        cnt = 0;

        while(cnt < k){
            Node next = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = next;
            cnt++;
        }

        return prevNode;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }    
    }

    public void displayLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to add to the list (type -1 to finish):");

        LinkedList1 l1 = new LinkedList1();

        while (true) {
            try {
                int num = sc.nextInt();
                if (num == -1) {
                    break;
                }
                l1.insert(num);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                sc.next();
            }
        }

        System.out.println("\nYour original linked list:");
        l1.displayLL();

        System.out.print("\nEnter the group size (k) for reversal: ");
        int k = sc.nextInt();

        // --- FIXES ARE HERE ---
        // 1. Pass l1.head to the method.
        // 2. Assign the returned new head back to l1.head.
        l1.head = l1.reverseKGroup(l1.head, k);

        System.out.println("\nYour list after reversing in groups of " + k + ":");
        // 3. Display the final, modified list.
        l1.displayLL();

        sc.close();
    }
}