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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // sorted list dummy
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // save next node

            // find position to insert
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // insert curr
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }
        return dummy.next;
    }
}
