package trees.binarytrees;

import java.util.ArrayList;

public class PreOrderTraversal {

    public static void preOrderHelper(TreeNode root, ArrayList<Integer>result){
        if(root==null){
            return;
        }
        result.add(root.data);
        preOrderHelper(root.left,result);
        preOrderHelper(root.right,result);
    }

    public static ArrayList<Integer> preOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        ArrayList<Integer> result = preOrderTraversal(root);

        System.out.println("Pre-order Traversal: " + result);
    }
}