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
    TreeNode prev = null;
    TreeNode w11 = null;
    TreeNode w12 = null;
    TreeNode w21 = null;
    TreeNode w22 = null;
    public void recoverTree(TreeNode root) {
        helper(root);
        if(w21==null){
            swap(w11,w12);
        } else {
            swap(w11,w22);
        }
    }
    public void helper(TreeNode root){
        if(root==null) return;

        helper(root.left);
        if(prev!=null && root.val <= prev.val){
            if(w11==null){
                w11 = prev;
                w12 = root;
            } else {
                w21 = prev;
                w22 = root;
            }
        }
        prev = root;
        helper(root.right);
    }
    public void swap(TreeNode t1, TreeNode t2){
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }
}