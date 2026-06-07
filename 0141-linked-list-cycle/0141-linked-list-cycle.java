/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //Brute Force 
        // TC : O(NlogN), SC = O(N)
        //We will use HashMap to store the data and index of nodes visited , 
        //if we found a visited node again it means loop is present 
        // ListNode temp = head ;
        // //track of  nodes 
        // HashMap<ListNode,Integer> map = new HashMap<>();
     
        // while(temp != null){
        //     //if node is already present , loop is present 
        //     if(map.containsKey(temp)){
        //         return true;
        //     }
        //     map.put(temp , 1);
        //     temp = temp.next;
        // }/

        // Optimised Approach : Slow and fast pointer , tc - O(N) , SC - O(1)
        ListNode slow = head ;
        ListNode fast = head ;
        if(head == null || head.next == null){
            return false;
        }
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}