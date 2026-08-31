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
    HashMap<Integer,Integer> hash = new HashMap<>();
    int idx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            hash.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1);
    }

    public TreeNode helper(int[] preorder, int low, int high) {
        if(low > high) return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        
        int i = hash.get(node.val);

        node.left = helper(preorder,low,i-1);
        node.right = helper(preorder,i+1,high);

        return node;
    }
}