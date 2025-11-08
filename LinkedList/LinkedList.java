package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1; // Initialize data with the provided value
        this.next = next1; // Initialize next with the provided reference
    }

    Node(int data1) {
        this.data = data1; // Initialize data with the provided value
        this.next = null; // Initialize next as null since it's the end of the list
    }

}

public class LinkedList {
    private static Node convertArray2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node insertAtHead(Node head, int val) {
        return new Node(val, head);
    }

    private static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val); // if no node are present then return the newly formed node.
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node n = new Node(val);
        temp.next = n;
        return head;
    }

    private static Node insertAtPos(Node head, int val, int k) { // here k is the position
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return null;
            }
        }

        if (k == 1) { // if position is 1 means before head.
            return new Node(val, head);
        }

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k - 1) { // check if the pointer reached one step before the insert position.
                Node n = new Node(val);
                n.next = temp.next;
                temp.next = n;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 6, 2, 3, 9, 7, 8 };
        Node head;
        head = convertArray2LL(arr);

        // Node temp = head;
        // System.out.println("The Linked List elements are: ");
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // head = insertAtHead(head, 27);
        // System.out.println(head.data);

        head = insertAtTail(head, 16);

        head = insertAtPos(head, 20, 1);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
