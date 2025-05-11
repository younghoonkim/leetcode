import java.util.ArrayList;
import java.util.List;

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

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);

        return result;
    }

    private void dfs(TreeNode node, List<Integer> result){
        if(node == null){
            return;
        }
        // left 탐색
        dfs(node.left, result);
        // 넣기
        result.add(node.val);
        // right 탐색
        dfs(node.right, result);
    }
}
