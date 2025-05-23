import com.sun.source.tree.Tree;

import java.util.*;

public class BinaryTreeLevelOrder {

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


    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);

        while(queue.size() > 0){
            int thisLevelCount = queue.size();
            List<Integer> curLevelList = new ArrayList<>();
            for(int i=0; i<thisLevelCount; i++){
                TreeNode curNode = queue.poll();
                if(curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if(curNode.right != null) {
                    queue.offer(curNode.right);
                }
                curLevelList.add(curNode.val);
            }
            result.add(curLevelList);
        }

        return result;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);

        int level = 1;

        while(queue.size() > 0){
            int thisLevelCount = queue.size();
            List<Integer> curLevelList = new ArrayList<>();
            for(int i=0; i<thisLevelCount; i++){
                TreeNode curNode = queue.poll();
                if(curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if(curNode.right != null) {
                    queue.offer(curNode.right);
                }
                curLevelList.add(curNode.val);
            }
            if(level % 2 == 0){
                Collections.reverse(curLevelList);
            }
            result.add(curLevelList);
            level++;
        }

        return result;
    }

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return 0;
        }

        queue.offer(root);

        int depth = 0;
        while(queue.size() > 0){
            int thisLevelCount = queue.size();

            for(int i=0; i<thisLevelCount; i++){
                TreeNode curNode = queue.poll();

                if(curNode.left != null){
                    queue.offer(curNode.left);
                }
                if(curNode.right != null){
                    queue.offer(curNode.right);
                }

            }

            depth++;
        }

        return depth;
    }
}
