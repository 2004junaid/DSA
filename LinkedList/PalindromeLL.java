package LinkedList;

import java.util.Stack;

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

public class PalindromeLL {
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

    private static boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != st.pop())
                return false;
            temp = temp.next;
        }
        return true;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 3, 2, 1 };
        ListNode head;
        head = convertArray2LL(arr);
        System.out.println("Is the Linked list palindrome: " + isPalindrome(head));
    }
}
