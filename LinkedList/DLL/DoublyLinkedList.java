package LinkedList.DLL;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1; // Initialize data with the provided value
        this.next = next1; // Initialize next with the provided reference
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1; // Initialize data with the provided value
        this.next = null; // Initialize next as null since it's the end of the list
        this.back = null;
    }

}

public class DoublyLinkedList {
    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev); // creating new node with the prev node as back
            prev.next = temp; // pointing next of prev to temp
            prev = temp; // update the prev for further addings
        }
        return head;
    }

    private static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head.next;
        head.next = null;
        temp.back = null;
        head = temp;

        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        Node tempNext = temp.next;
        temp.next = null;
        tempNext.back = null;
        return head;
    }

    private static Node deleteValue(Node head, int val) {
        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.data != val) {
            temp = temp.next;
        }
        Node n = temp.next;
        temp.next = temp.next.next;
        n.back = temp;

        return head;
    }

    private static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node prev = null;
        Node current = head;
        while (current != null) { // swapping the links
            prev = current.back;
            current.back = current.next;
            current.next = prev;

            current = current.back;
        }
        return prev.back;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 8, 9 };
        Node head = convertArr2DLL(arr);
        // printDLL(head);

        // head = deleteHead(head);
        // printlDLL(head);

        // head = deleteTail(head);
        // printDLL(head);

        // head = deleteValue(head, 4);
        // printDLL(head);

        head = reverseList(head);
        printDLL(head);

    }
}
