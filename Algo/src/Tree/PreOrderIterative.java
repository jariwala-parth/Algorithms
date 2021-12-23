package Tree;

import java.util.Stack;

public class PreOrderIterative {
    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeNode.makeTree();

        PreOrderIterative p = new PreOrderIterative();
        p.preOrderIterative(root);
    }

    public void preOrderIterative(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
