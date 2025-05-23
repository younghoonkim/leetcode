public class SumRootLeafNumbers {
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

    private int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;

        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int sub){
        //leaf노드
        if(node.left == null && node.right == null){
            sub = sub * 10 + node.val;
            sum = sum + sub;
            return;
        }

        if(node.left != null){
            dfs(node.left, sub * 10 + node.val);
        }
        if(node.right != null){
            dfs(node.right, sub * 10 + node.val);
        }
    }
}
