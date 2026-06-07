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
    public ListNode middleNode(ListNode head) {

        //Brute Force ==>O(N+N/2)
        // if(head == null || head.next == null){
        //     return head;
        // }
        // int count = 0 ;
        // ListNode temp = head;
        // while(temp != null ){
        //     count++;
        //     temp = temp.next;
        // }
        
        // int mid = count/2 + 1;
        // temp = head ;
        // while(temp!=null){
        //     mid--;
        //     if(mid == 0){
        //         break;
        //     }
        //     temp=temp.next;
        // }
        // return temp;
        
        //==============================================================
        //OPTIMAL APPROACH - Tortoise & Hare Approach 
        //Slow and fast Pointer 

        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head ;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //one nade at a time
            fast = fast.next.next; // two nodes at a time 
        }

        //when fast reaches at end ....slow pointer will be at middle of LL

        return slow;
       
    }
}