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
    public List<Integer> rightSideView(TreeNode root) {
    //Approach : Last Node of Every Level , BFS approach , Level order 
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q  = new LinkedList<>();
        TreeNode node = new TreeNode();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                node = q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(node.val); // Last Node of every level 
        }

        return list;
        
    }
    
}