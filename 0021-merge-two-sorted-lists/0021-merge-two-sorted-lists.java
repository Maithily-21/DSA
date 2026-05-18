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
        
        ListNode dummy = new ListNode(0);
        ListNode mover = dummy ;
        ListNode temp1 = list1;
        ListNode temp2 = list2 ;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
               mover.next = temp1;
               temp1 = temp1.next;
            }else{
                mover.next = temp2;
                temp2 = temp2.next;
            }
            mover = mover.next;
        }
        
        //if any node left in lists 
        if(temp1 != null){
            mover.next = temp1;
        }else{
            mover.next = temp2;
        }
        return dummy.next;
    }
}