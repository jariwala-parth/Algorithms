package Tree;

import java.util.ArrayList;

public class TreeTraversalRecursive {

    ArrayList<Integer> preOrder = new ArrayList<>();
    ArrayList<Integer> inOrder = new ArrayList<>();
    ArrayList<Integer> postOrder = new ArrayList<>();

    public static void main(String[] args) {

        BinaryTreeNode root = BinaryTreeNode.makeTree();
        TreeTraversalRecursive traversalRecursive = new TreeTraversalRecursive();
        System.out.print("Recursive PREOrder: " + traversalRecursive.preOrderTraversal(root));

        System.out.print("\nRecursive INOrder: " + traversalRecursive.inOrderTraversal(root));
        System.out.print("\nRecursive POSTOrder: " + traversalRecursive.postOrderTraversal(root));

    }

    public ArrayList<Integer> preOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return preOrder;
        }
        preOrder.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        return preOrder;
    }

    public ArrayList<Integer> inOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return inOrder;
        }
        inOrderTraversal(root.left);
        inOrder.add(root.val);
        inOrderTraversal(root.right);
        return inOrder;
    }

    public ArrayList<Integer> postOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return postOrder;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        postOrder.add(root.val);
        return postOrder;
    }
}
