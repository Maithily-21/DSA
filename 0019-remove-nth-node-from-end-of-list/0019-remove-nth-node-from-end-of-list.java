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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    int totalCount = 0;
    ListNode temp = head;

    while(temp != null){
        totalCount++;
        temp = temp.next;
    }

    temp = dummy;

    for(int i = 0; i < totalCount - n; i++){
        temp = temp.next;
    }

    temp.next = temp.next.next;

    return dummy.next;
    }
}