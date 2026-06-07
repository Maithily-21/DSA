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
    public ListNode detectCycle(ListNode head) {
         ListNode temp = head ;
        //track of  nodes 
        HashMap<ListNode,Integer> map = new HashMap<>();
        int count = 0;
        while(temp != null){
            //if node is already present , loop is present 
            if(map.containsKey(temp)){
               break;
            }
            map.put(temp , count);
            count++;
            temp = temp.next;
        }

        return temp;
    }
}