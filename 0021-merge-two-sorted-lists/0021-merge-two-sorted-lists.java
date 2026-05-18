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
       
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
               mover.next = list1;
               list1 = list1.next;
            }else{
                mover.next = list2;
                list2 = list2.next;
            }
            mover = mover.next;
        }
        
        //if any node left in lists 
        if(list1 != null){
            mover.next = list1;
        }else{
            mover.next = list2;
        }
        return dummy.next;
    }
}