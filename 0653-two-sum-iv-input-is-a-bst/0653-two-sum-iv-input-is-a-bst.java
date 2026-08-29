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
    Stack<TreeNode> leftStack = new Stack<>();
    Stack<TreeNode> rightStack = new Stack<>();

    public boolean findTarget(TreeNode root, int k) {
        leftPush(root);
        rightPush(root);

        while(!leftStack.isEmpty() && !rightStack.isEmpty()){
            TreeNode left = leftStack.peek();
            TreeNode right = rightStack.peek();

            if(left==right) break;
            int val = left.val + right.val;

            if(val==k) return true;
            else if(val < k) nextLeft();
            else nextRight();
        }

        return false;
    }

    public void nextLeft(){
        TreeNode temp = leftStack.pop();
        if(temp.right!=null){
            leftPush(temp.right);
        }
    }

    public void nextRight(){
        TreeNode temp = rightStack.pop();
        if(temp.left!=null){
            rightPush(temp.left);
        }
    }

    public void leftPush(TreeNode root){
        while(root!=null){
            leftStack.push(root);
            root = root.left;
        }
    }
    public void rightPush(TreeNode root){
        while(root!=null){
            rightStack.push(root);
            root = root.right;
        }
    }
}