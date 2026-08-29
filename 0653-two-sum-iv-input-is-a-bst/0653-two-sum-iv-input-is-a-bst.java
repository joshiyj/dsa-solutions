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
    List<Integer> asc = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        helper(root);

        int i = 0;
        int j = asc.size()-1;
        while(i<j){
            if(asc.get(i)+asc.get(j)==k) return true;
            if(asc.get(i)+asc.get(j) < k){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    public void helper(TreeNode root){
        if(root==null) return;

        helper(root.left);
        asc.add(root.val);
        helper(root.right);
    }
}