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
    public boolean isCompleteTree(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(temp!=null){
                    l1.add(temp.val);
                    q.offer(temp.left);
                    q.offer(temp.right);
                } else {
                    l1.add(-1);
                }
            }
        }

        int idx = 0;
        while(idx<l1.size() && l1.get(idx)!=-1){
            idx++;
        }
        while(idx<l1.size()){
            if(l1.get(idx++)!=-1) return false;
        }

        return true;

    }
}