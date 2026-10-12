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
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean rev = false;

        while(!q.isEmpty()){
            int size = q.size();
            int[] arr = new int[size];

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                int idx = (rev) ? size-1-i : i;
                arr[idx] = curr.val;
            }
            List<Integer> level = new ArrayList<>();
            for(int val: arr){
                level.add(val);
            }
            result.add(level);
            rev = !rev;
        }

        return result;
    }
}