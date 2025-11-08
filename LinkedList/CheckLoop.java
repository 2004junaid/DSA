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

public class CheckLoop {
    private static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ListNode head;
    }
}
