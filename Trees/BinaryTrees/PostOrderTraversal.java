package Trees.BinaryTrees;

import java.util.ArrayList;

public class PostOrderTraversal {
    public static void postOrderHelper(TreeNode root, java.util.ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        postOrderHelper(root.left, result);
        postOrderHelper(root.right, result);
        result.add(root.data);
    }

    public static ArrayList<Integer> postOrderTraversal(TreeNode root) {
        java.util.ArrayList<Integer> result = new java.util.ArrayList<>();
        postOrderHelper(root, result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        java.util.ArrayList<Integer> result = postOrderTraversal(root);

        System.out.println("Post-order Traversal: " + result);
    }
}
