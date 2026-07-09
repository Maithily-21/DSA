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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        if(root == null){
            return wrapList;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
     
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subList = new ArrayList<>();
        
            for(int i = 0 ; i < size ; i++){
                TreeNode node = q.poll();
                subList.add(node.val);
           
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            if(!leftToRight){
                Collections.reverse(subList);
            }
            leftToRight = !leftToRight;
            wrapList.add(subList);
        }
        return wrapList;
    }
}