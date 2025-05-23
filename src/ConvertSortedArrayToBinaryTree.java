public class ConvertSortedArrayToBinaryTree {

    /**
     * Definition for a binary tree node. */
    class TreeNode {
        int val;
        ConvertSortedArrayToBinaryTree.TreeNode left;
        ConvertSortedArrayToBinaryTree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, ConvertSortedArrayToBinaryTree.TreeNode left, ConvertSortedArrayToBinaryTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        return createBST(nums, 0, nums.length - 1);
    }

    public TreeNode createBST(int[] nums,int leftIdx, int rightIdx){
        if(leftIdx > rightIdx){
            return null;
        }
        int midIdx = (leftIdx + rightIdx) / 2;

        TreeNode node = new TreeNode(nums[midIdx]);

        // 왼쪽넣기
        node.left = createBST(nums, leftIdx, midIdx - 1);

        // 오른쪽넣기
        node.right = createBST(nums, midIdx+1, rightIdx);

        return node;

    }


}
