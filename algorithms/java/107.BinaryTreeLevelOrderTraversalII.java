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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        getList(root, 0, list);
        Collections.reverse(list);
        return list;
    }

    public void getList(TreeNode root, int depth, List<List<Integer>> list){
        if(root == null) return;

        if(depth == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);

        if(root.left != null) getList(root.left, depth + 1, list);
        if(root.right != null) getList(root.right, depth + 1, list);
    }
}