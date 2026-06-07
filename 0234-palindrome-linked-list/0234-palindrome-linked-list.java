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
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next == null){
            return true;
        }
        //Using slow and fast approach 
        ListNode slow = head;
        ListNode fast = head;
        //fast!=null even LL 
        //fast.next!=null odd LL
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Now slow pointer is at middle of LL
        //reverse the other half off the LL
        if(fast!=null){
            //odd LL 
            //you have to reverse set slow = slow.next ,we wont compare  middle element of odd list
            slow = slow.next;
        }
        ListNode prev = null;
        
        while(slow!=null){
            fast = slow.next;
            slow.next = prev;
            prev = slow ;
            slow = fast;
        }
        //reversed head is prev
        // compare prev and old head values 
        fast = head;
        while(prev != null){
            //dont return true at starting ,,,,check till end if found then true will be returned automatically till end 
            if(fast.val != prev.val){
                return false;
            }
            fast=fast.next;
            prev=prev.next;
        }

        return true;
        
    }
}