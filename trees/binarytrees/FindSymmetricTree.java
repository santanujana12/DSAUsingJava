package trees.binarytrees;

public class SymmetricTree {

    public static boolean findIsSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.data == right.data &&
               findIsSymmetric(left.left, right.right) &&
               findIsSymmetric(left.right, right.left);
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        return findIsSymmetric(root.left, root.right);
    }

    public static void main(String[] args) {
        // Creating the tree
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

        System.out.println(isSymmetric(root));  // Output: false
    }
}
