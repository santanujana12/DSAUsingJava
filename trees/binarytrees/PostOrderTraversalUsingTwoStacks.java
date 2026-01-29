package trees.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalUsingTwoStacks {
    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            TreeNode curr = s1.pop();
            s2.push(curr.data);

            if (curr.left != null) {
                s1.push(curr.left);
            }
            if (curr.right != null) {
                s1.push(curr.right);
            }
        }

        while (!s2.isEmpty()) {
            ans.add(s2.pop());
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
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}