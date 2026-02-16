package trees.binarytrees;


public class GoodNodesInBinaryTree {

    public static void countGoodNodes(TreeNode root, int maxValue, int[] count) {
        if (root == null) {
            return;
        }

        if (root.data >= maxValue) {
            maxValue = root.data;
            count[0]++;
        }

        countGoodNodes(root.left, maxValue, count);
        countGoodNodes(root.right, maxValue, count);
    }

    public static int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] count = new int[1]; // Using array to simulate pass-by-reference
        countGoodNodes(root, root.data, count);
        return count[0];
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println(goodNodes(root));
    }
}
