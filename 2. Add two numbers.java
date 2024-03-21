/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode p = l1, q=l2, curr = temp;
        int val = 0;    
        while (p != null || q != null) {
            int x;
            if (p != null) {
                x = p.val;
            }
            else {
                x = 0;
            }
            
            int y;
            if(q!= null) {
                y=q.val;
            }
            else {
                y=0;
            }
            int sum = val + x + y;
            val = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        if (val > 0) {
            curr.next = new ListNode(val);
        }
        
        return temp.next;
    }
}