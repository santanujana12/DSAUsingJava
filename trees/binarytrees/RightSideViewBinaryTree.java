package trees.binarytrees;
import java.util.*;


public class RightSideViewBinaryTree {

    // BFS Approach
    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();

                if (i == 0) { // First node at this level (rightmost due to insertion order)
                    res.add(curr.data);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }
            }
        }

        return res;
    }

    // Recursive helper
    public static void traverse(TreeNode root, List<Integer> res, int level) {
        if (root == null) {
            return;
        }

        if (level == res.size()) {
            res.add(root.data);
        }

        traverse(root.right, res, level + 1);
        traverse(root.left, res, level + 1);
    }

    // Recursive Approach
    public static List<Integer> rightSideViewRec(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        traverse(root, res, 0);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        List<Integer> rightView = rightSideViewRec(root);

        for (int val : rightView) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
