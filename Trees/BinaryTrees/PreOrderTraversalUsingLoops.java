package Trees.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalUsingLoops {

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            res.add(curr.data);

            // Push right first so left is processed first
            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right.left = new TreeNode(9);

        List<Integer> result = preorderTraversal(root);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}