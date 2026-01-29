package trees.binarytrees;
import java.util.*;


public class LevelOrderTraversalUsingRecursion {

    // This will store the final level order result
    static List<List<Integer>> result = new ArrayList<>();

    static void traversalDFS(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        // If this level is visited for the first time
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.data);

        traversalDFS(root.left, level + 1);
        traversalDFS(root.right, level + 1);
    }

    static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        result.clear(); // important if method is called multiple times
        traversalDFS(root, 0);
        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);

        // children of node 5
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        // child of node 8
        root.right.right.left = new TreeNode(9);

        List<List<Integer>> result = levelOrderTraversal(root);

        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
