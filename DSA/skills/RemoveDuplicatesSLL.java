package DSA.skills;

import java.util.*;

class Node{
    int data;
    Node next;
    Node head;

    Node(int data){
        this.data = data;
    }
} 

public class RemoveDuplicatesSLL {

    // Function to make SLL using user input
    static Node buildList(Scanner sc){
        int val = sc.nextInt();
        if(val == -1) return null;
        Node head = new Node(val);
        Node current = head;

        while(true){
            val = sc.nextInt();
            if(val == -1) break;
            current.next = new Node(val);
            current = current.next;
        }
        return head;
    }

    // Method for removing consecutive duplicates from SLL
    static Node removeDuplicates(Node head){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

    // Method to print SLL
    static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = buildList(sc);
        System.out.println("Original List:");
        printList(head);
        head = removeDuplicates(head);
        System.out.println("\nList after removing duplicates:");
        printList(head);

    }
}
