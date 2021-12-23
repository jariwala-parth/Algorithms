package Tree;

import java.util.Stack;

public class InOrderIterative {
    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeNode.makeTree();

        InOrderIterative p = new InOrderIterative();
        p.inOrderIterative(root);
    }

    public void inOrderIterative(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();

        BinaryTreeNode node = root;

        while (!stack.isEmpty() || node != null) {

            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.print(node.val + " ");
            node = node.right;
        }
    }
}
