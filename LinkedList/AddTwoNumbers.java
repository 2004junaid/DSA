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

public class AddTwoNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummyNode = new ListNode(-1); // dummy to reduce the complexity of the code
        ListNode curr = dummyNode;
        int carry = 0;
        while (t1 != null || t2 != null) { // if one list end addition should be continued with other
            int sum = carry; // intially 0
            if (t1 != null)
                sum = sum + t1.data; // adding the node to the sum
            if (t2 != null)
                sum = sum + t2.data;
            ListNode newNode = new ListNode(sum % 10); // storing the digits into the node
            carry = sum / 10; // updating the carry

            curr.next = newNode; // adding the node to current list
            curr = curr.next;

            if (t1 != null)
                t1 = t1.next;
            if (t2 != null)
                t2 = t2.next;
        }
        if (carry > 0) { // at last if carry is remaining then add it to the list.
            ListNode carryNode = new ListNode(carry);
            curr.next = carryNode;
        }
        return dummyNode.next;

    }

    public static void main(String[] args) {
        int[] arrA = { 2, 4, 3 };
        ListNode headA = convertArray2LL(arrA);
        int[] arrB = { 5, 6, 4 };
        ListNode headB = convertArray2LL(arrB);

        ListNode answerList = addTwoNumbers(headA, headB);
        ListNode temp = answerList;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
