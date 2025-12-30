package LinkedList;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Map to store the mapping from Old Node -> New Node
        Map<Node, Node> map = new HashMap<>();

        // Step 1: Create a copy of each node and store it in the map.
        // We do NOT link pointers yet.
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 2: Assign next and random pointers using the map.
        curr = head;
        while (curr != null) {
            Node copyNode = map.get(curr);
            
            // Link the New Node's next to the copy of the Old Node's next
            copyNode.next = map.get(curr.next);
            
            // Link the New Node's random to the copy of the Old Node's random
            copyNode.random = map.get(curr.random);
            
            curr = curr.next;
        }

        // Return the copy of the head
        return map.get(head);
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Node val: " + temp.val + ", Random points to: " + randomVal);
            temp = temp.next;
        }
    }
}

public class CopyRandomList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Creating the list: 1 -> 2
        Node head = new Node(1);
        head.next = new Node(2);
        
        // Setting random pointers
        head.random = head.next;      // 1 random -> 2
        head.next.random = head;      // 2 random -> 1
        
        Node copiedListHead = solution.copyRandomList(head);
        
        System.out.println("Original list:");
        solution.display(head);
        
        System.out.println("Copied list:");
        solution.display(copiedListHead);
    }
}