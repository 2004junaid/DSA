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

public class LengthOfLoop {
    private static int hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) // checking the presence of loop.
                return lenghtOfLoop(slow, fast);
        }
        return -1;
    }

    private static int lenghtOfLoop(ListNode slow, ListNode fast) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) { // iterate the fast till it reaches back to slow. and update the count.
            count++;
            fast = fast.next;
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ListNode head;
    }
}
