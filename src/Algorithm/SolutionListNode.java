package Algorithm;

import TestClass.ListNode;

import java.util.List;

public class SolutionListNode {

    public static void main(String[] args) {

        ListNode value = new ListNode(1);
        ListNode value1 = new ListNode(2, value);
        ListNode value2 = new ListNode(3, value1); // l1 or l2
        ListNode current = value2;
        ListNode finalValue = value2;

        System.out.println(current.getVal());
        System.out.println(current.getNext().getVal());
        System.out.println(current.getNext().getNext().getVal());
        while (current != null) {
            System.out.println(current.getVal());
            current = current.getNext();
        }

        ListNode result = addTwoNumbers(finalValue, finalValue);
        while (result != null) {
            System.out.println(result.getVal());
            result = result.getNext();
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
