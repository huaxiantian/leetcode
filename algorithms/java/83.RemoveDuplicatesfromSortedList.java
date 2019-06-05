/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        if(head.next == null) return head;

        head.next = deleteDuplicates(head.next);

        if(head.val == head.next.val)
            return head.next;
        return head;
    }
}