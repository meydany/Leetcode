/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Leetcode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        Stack<ListNode> sumStack = new Stack<ListNode>();

        while(l1 != null | l2 != null) {
            if(l1 != null) {
                stack1.push(l1);
                l1 = l1.next;
            }

            if(l2 != null) {
                stack2.push(l2);
                l2 = l2.next;
            }
        }

        int carry = 0;
        while(!stack1.empty() || !stack2.empty()) {
            int val1 = 0;
            int val2 = 0;
            if(!stack1.empty()) val1 = stack1.pop().val;
            if(!stack2.empty()) val2 = stack2.pop().val;
            int currSum = carry + val1 + val2;
            carry = currSum/10;
            currSum %= 10;

            sumStack.push(new ListNode(currSum));
        }

        if(carry != 0) {
            sumStack.push(new ListNode(carry));
        }

        ListNode finalSum = new ListNode(0);
        ListNode dummy = finalSum;
        while(!sumStack.empty()) {
            finalSum.next = sumStack.pop();
            finalSum = finalSum.next;
        }

        return dummy.next;
    }
}
