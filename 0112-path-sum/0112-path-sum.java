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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0);
        return ans;
    }
    public void helper(TreeNode root, int t, int sum){
        if(root==null) return;

        sum += root.val;

        if(root.left==null && root.right==null){
            if(sum==t){
                ans = true;
                return;
            }
        }

        helper(root.left,t,sum);
        helper(root.right,t,sum);
    }
}