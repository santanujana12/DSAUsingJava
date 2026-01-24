package Trees.BinaryTrees;

import java.util.*;


public class InorderTraversalUsingStack {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            ans.add(curr.data);
            curr = curr.right;
        }

        return ans;
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

        List<Integer> result = inorderTraversal(root);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
