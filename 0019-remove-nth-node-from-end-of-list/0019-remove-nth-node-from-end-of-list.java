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
    int nn;
    boolean flag;
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        nn = n;
        flag = false;
        head = findAndRemove(head);
        
        return head;
    }
    
    ListNode findAndRemove(ListNode head) {
        if (head.next == null) {
            flag = true;
            if (nn == 1) head = null;

            nn--;
            return head;
        }
        
        head.next = findAndRemove(head.next);
        
        if (head.next != null && flag && nn == 1) {
            head = head.next;
        }
        
        nn--;
        
        return head;
    }
}