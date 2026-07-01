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
    public boolean isBalanced(TreeNode root) {
       return HeightOfTree(root) != -1;
    }
    public int HeightOfTree(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int left_h = HeightOfTree(root.left);
        int right_h = HeightOfTree(root.right);
        if(left_h == -1 || right_h == -1){
            return -1;
        }
        if(Math.abs(left_h - right_h) >  1){
            return -1;
        }
        return 1 + Math.max(left_h , right_h);
    }
}