package LinkedList;

import java.util.HashMap;
import java.util.Map;

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

public class IntersectionOfTwoLists {
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

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        // Hash for storing the occurances of the node.
        Map<ListNode, Integer> map = new HashMap<>();
        while (tempA != null) {
            if (map.containsKey(tempA)) {
                map.put(tempA, map.get(tempA) + 1);
            } else {
                map.put(tempA, 1);
            }
            tempA = tempA.next;
        }
        while (tempB != null) {
            if (map.containsKey(tempB)) { // if the node is already present it means that the node has also appeared in
                                          // first List which will make this as intersection point.
                return tempB;
            } else {
                map.put(tempB, 1);
            }
            tempB = tempB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arrA = { 4, 1, 8, 4, 5 };
        ListNode headA = convertArray2LL(arrA);
        int[] arrB = { 5, 6, 1, 8, 4, 5 };
        ListNode headB = convertArray2LL(arrB);

        ListNode intersect = getIntersectionNode(headA, headB);
        System.out.println(intersect.data);

    }
}
