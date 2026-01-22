package Trees.BinaryTrees;

import java.util.ArrayList;

public class InOrderTraversal {

    public static void inOrderHelper(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left, result);
        result.add(root.data);
        inOrderHelper(root.right, result);
    }

    public static ArrayList<Integer> inOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        ArrayList<Integer> result = inOrderTraversal(root);

        System.out.println("In-order Traversal: " + result);
    }
}

