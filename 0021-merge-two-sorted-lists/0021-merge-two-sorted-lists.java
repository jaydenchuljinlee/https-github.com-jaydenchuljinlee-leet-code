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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode dummyhead = null;
        while (list1 != null || list2 != null) {
            if (list1 == null || (list2 != null && list2.val <= list1.val)) {

                if (dummyhead == null) dummyhead = new ListNode(list2.val);
                else dummyhead = new ListNode(list2.val, dummyhead);
                
                list2 = list2.next;
                continue;
            }
            
            if (list2 == null || (list1 != null && list1.val <= list2.val)) {
                if (dummyhead == null) dummyhead = new ListNode(list1.val);
                else dummyhead = new ListNode(list1.val, dummyhead);
                
                list1 = list1.next;
                continue;
            }
        }

        if (dummyhead == null) return null;

        ListNode min = new ListNode(dummyhead.val);
        dummyhead = dummyhead.next;
        while(dummyhead != null) {
            min = new ListNode(dummyhead.val, min);
            dummyhead = dummyhead.next;
        }

        return min;
    }
}