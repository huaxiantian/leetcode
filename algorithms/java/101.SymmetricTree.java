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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        TreeNode t1 = root.left;
        TreeNode t2 = root.right;

        return isTrue(t1, t2);
    }

    public boolean isTrue(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;

        if(t1 == null || t2 == null) return false;

        return (t1.val == t2.val) && isTrue(t1.left, t2.right) && isTrue(t1.right, t2.left);
    }
}