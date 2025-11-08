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

public class LinkedList2 {
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

    private static Node deleteHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null)
            return head;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next; // travese till before the last element. where temp.next is the last value and
                              // temp.next.next will be null
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 6, 2, 3, 9, 7, 8 };
        Node head;
        head = convertArray2LL(arr);

        // head = deleteHead(head);
        head = deleteTail(head);
        Node temp = head;
        System.out.println("The Linked List elements are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
