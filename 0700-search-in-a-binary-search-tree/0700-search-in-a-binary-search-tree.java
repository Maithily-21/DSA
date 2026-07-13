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
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            if(root.val > val){
                //move to left subtree for lesser value 
                root = root.left;
            }else{
                //move to greater values 
                root = root.right;
            }
        }
        //if target found root Node will be returned , else if keep on traversing until it reaches null
        return root;
    }
}