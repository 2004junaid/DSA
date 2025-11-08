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

public class DeleteOccuranceDLL {
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

    private static Node deleteOccurance(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                if (temp == head)
                    head = head.next;
                Node nextNode = temp.next;
                Node backNode = temp.back;
                // now deleting by removing links to key
                if (nextNode != null)
                    nextNode.back = backNode;
                if (backNode != null)
                    backNode.next = nextNode;
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String args[]) {
        Node head;
        int[] arr = { 2, 1, 3, 4, 2, 1, 2, 2 };
        head = convertArr2DLL(arr);
        printDLL(head);
        head = deleteOccurance(head, 2);
        printDLL(head);
    }
}
