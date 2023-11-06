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
        // the head is to go back again when the head reach the end point
        // the flag become false when the head reach the end point
        // the nn is the point of node to remove. it decrease by one to find the point
        // what the nn is 1 means to reach the point.
        if (head.next == null) {
            flag = true;
            
            // the given n exist the end point
            if (nn == 1) head = null;

            nn--;
            return head;
        }
        
        // if the head isn't the end, it process the recursive logic
        head.next = findAndRemove(head.next);
        
        // when the given n exist somewhere between the start point and the end point
        if (head.next != null && flag && nn == 1) {
            head = head.next;
        }
        
        nn--;
        
        return head;
    }
}