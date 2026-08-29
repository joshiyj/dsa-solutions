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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0,new ArrayList<>());
        return result;
    }
    public void helper(TreeNode root, int t, int sum, List<Integer> curr){
        if(root==null) return;

        curr.add(root.val);
        sum += root.val;

        if(root.left==null && root.right==null){
            if(sum==t){
                result.add(new ArrayList<>(curr));
            }
            curr.remove(curr.size()-1);
            return;
        }

        helper(root.left,t,sum,curr);
        helper(root.right,t,sum,curr);
        curr.remove(curr.size()-1);
    }
}