package LinkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data1, ListNode next1) {
        this.data = data1; // Initialize data with the provided value
        this.next = next1; // Initialize next with the provided reference
    }

    ListNode(int data1) {
        this.data = data1; // Initialize data with the provided value
        this.next = null; // Initialize next as null since it's the end of the list
    }

}

public class RemoveNthNode {
    private static ListNode convertArray2LL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count == n) {
            ListNode newHead = head.next;
            return newHead;
        }
        int res = count - n;
        temp = head;
        while (temp != null) {
            res--;
            if (res == 0)
                break; // iterate till we reach one node less than to be deleted;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ListNode head;
        head = convertArray2LL(arr);
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        head = removeNthFromEnd(head, 4);
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
