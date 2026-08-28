/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root,p,q);
        return ans;
    }
    public void helper(TreeNode root, TreeNode p, TreeNode q){
        if(root==p || root==q){
            ans = root;
            return;
        }
        if(root.val < p.val && root.val < q.val){
            lowestCommonAncestor(root.right,p,q);
        }
        if(root.val > p.val && root.val > q.val){
            lowestCommonAncestor(root.left,p,q);
        }
        if(root.val > p.val && root.val < q.val){
            ans = root;
            return;
        }
        if(root.val > q.val && root.val < p.val){
            ans = root;
            return;
        };
    }
}