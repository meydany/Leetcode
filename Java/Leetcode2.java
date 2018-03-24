/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Leedcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        int sum = curr1.val + curr2.val;
        ListNode root = new ListNode(sum%10);
        ListNode current = root;

        int nextSum = 0;
        if(sum >= 10) {
            nextSum = 1;
        }else {
            nextSum = 0;
        }

        while(curr1.next != null || curr2.next != null) {
            if(curr1.next == null) {
                curr1.next = new ListNode(0);
            }else if(curr2.next == null) {
                curr2.next = new ListNode(0);
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
            sum = curr1.val + curr2.val + nextSum;

            if(sum >= 10) {
                nextSum = 1;
            }else {
                nextSum = 0;
            }

            current.next = new ListNode(sum%10);
            current = current.next;
        }

        if(nextSum == 1) {
            current.next = new ListNode(1);
        }

        return root;
    }
}
