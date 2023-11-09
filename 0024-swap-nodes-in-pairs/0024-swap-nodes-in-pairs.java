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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        int num = head.val;
        head.val = head.next.val;
        head.next.val = num;
        
        if (head.next.next == null) return head;
        
        swapPairs(head.next.next);
        
        return head;
        
    }
}