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
    public ListNode reverseList(ListNode head) {

        //Brute Force -TIME COMPLEXITY :  O(2N) , SPACE COMPLEXITY : O(N)
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head ; 

        //1] Traversing the LL and storing the values in Stack 
        while(temp != null){
            stack.push(temp.val);
            temp=temp.next;
        }

        temp =  head ;
        //2] poping out the stack values and replacing the data values with top values of stack 
        while(temp != null){
            temp.val = stack.peek();
            stack.pop();
            temp=temp.next;
        }

        return head;
    }
}