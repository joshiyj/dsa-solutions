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
    List<Integer> l1 = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=0; i<l1.size()-1; i++){
            if(l1.get(i)>=l1.get(i+1)) return false;
        }
        return true;
    }
    public void inorder(TreeNode root){
        if(root==null) return;

        inorder(root.left);
        l1.add(root.val);
        inorder(root.right);
    }
}