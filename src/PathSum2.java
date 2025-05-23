import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    /**
     * Definition for a binary tree node. */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        dfs(root, new ArrayList<Integer>(), result, 0, targetSum);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> path, List<List<Integer>> result, int sum, int target){

        //leaf
        if(node.left == null && node.right == null){
            if(sum + node.val == target){
                // target이 맞다.
                List<Integer> clone = new ArrayList<>(path);
                clone.add(node.val);

                result.add(clone);
            }
            return;
        }

        path.add(node.val);
        if(node.left != null){
            dfs(node.left, path, result, sum + node.val, target);
        }
        if(node.right != null){
            dfs(node.right, path, result, sum + node.val, target);
        }
        path.remove(path.size()-1);
    }


}
