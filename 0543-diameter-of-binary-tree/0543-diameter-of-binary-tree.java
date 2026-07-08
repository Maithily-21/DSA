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
    int max = 0 ; //Global variable 
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return max;

    }
    public int findMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = findMax(root.left);
        int right = findMax(root.right);
        max = Math.max(max , left + right);

        return 1 + Math.max(left , right);
    }
}