package Tree;

import java.util.Stack;

public class PostOrderIterative {
    public static void main(String[] args) {
        BinaryTreeNode root = BinaryTreeNode.makeTree();

        PostOrderIterative p = new PostOrderIterative();
        p.postOrderIterative(root);
    }

    public void postOrderIterative(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        BinaryTreeNode temp;
        System.out.println("2 4 3 6 8 7 5");
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                temp = stack.peek().right;
                if (temp != null) {
                    node = temp;
                } else {
                    temp = stack.pop();
                    System.out.print(temp.val + " ");
                    while (!stack.isEmpty() && stack.peek().right == temp) {
                        temp = stack.pop();
                        System.out.print(temp.val + " ");
                    }
                }
            }
        }
    }
}
