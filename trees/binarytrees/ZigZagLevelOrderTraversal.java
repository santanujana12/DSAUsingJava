package trees.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
    private static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static List<List<Integer>> zigzagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levelNum = 0;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                level.add(curr.data);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            if (levelNum % 2 == 1) {
                level = reverse(level);
            }
            result.add(level);
            levelNum++;
        }

        return result;
    }

  

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // root.right.left is null
        root.right.right = new TreeNode(8);

        // children of node 5
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        // child of node 8
        root.right.right.left = new TreeNode(9);

        List<List<Integer>> result = zigzagLevelOrderTraversal(root);

        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
