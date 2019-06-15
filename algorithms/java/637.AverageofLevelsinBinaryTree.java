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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            double sum = 0;
            TreeNode node;
            int size = queue.size();

            for(int i =0; i < size; i++){
                node = queue.poll();
                sum += node.val;

                if(node.left  != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            list.add(sum/size);
        }
        return list;
    }
}