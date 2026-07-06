/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //Using iterative approach 
        //Using Stack 
        List<Integer> preorderList = new ArrayList<>();
        if(root == null){
            return preorderList;
        }
        Stack<TreeNode> st = new Stack<TreeNode>();
        //first push root node 
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preorderList.add(root.val);
            //Second push right npode 
            if(root.right != null){
                st.push(root.right);
            }
            //Thirt push leftnode
            if(root.left != null){
                st.push(root.left);
            }

        }
        return preorderList;
    }
  
}