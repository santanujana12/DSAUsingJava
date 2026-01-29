package trees.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalUsingOneStack {

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;
        TreeNode isVisited = null;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            TreeNode peekNode = st.peek();

            if (peekNode.right != null && peekNode.right != isVisited) {
                curr = peekNode.right;
            } else {
                ans.add(peekNode.data);
                isVisited = peekNode;
                st.pop();
            }
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

        List<Integer> result = postorderTraversal(root);

        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
