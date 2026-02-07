package trees.binarytrees;

import java.util.*;

public class FindDiameterOfTree {
    static int findHeight(TreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }

        int left = findHeight(root.left, diameter);
        int right = findHeight(root.right, diameter);

        diameter[0] = Math.max(diameter[0], left + right);

        return 1 + Math.max(left, right);
    }

    // Diameter of Binary Tree
    static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] diameter = new int[1];
        findHeight(root, diameter);
        return diameter[0];
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Diameter of the tree: " + diameterOfTree(root));
    }
}
