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
    private void solve(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path){
        if( root == null) return; 
        path.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val ) result.add(new ArrayList<>(path));
        solve(root.left, targetSum-root.val, result, path);
        solve(root.right, targetSum-root.val, result, path);
         path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if( root == null) return result;
        solve(root, targetSum, result, path);
        return result;
    }
}