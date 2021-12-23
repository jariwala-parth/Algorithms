package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPostOrderAndInOrder {

    static int postIndex = 0;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        TreeTraversalRecursive traversalRecursive = new TreeTraversalRecursive();
        BinaryTreeNode root = BinaryTreeNode.makeTree();
        ArrayList<Integer> post = traversalRecursive.postOrderTraversal(root);
        ArrayList<Integer> in = traversalRecursive.inOrderTraversal(root);
        for (int i = 0; i < in.size(); i++) {
            map.put(in.get(i), i);
        }
        postIndex = in.size() - 1;
        BinaryTreeNode ans = ConstructTreeFromPostOrderAndInOrder.helper(post, 0, in.size() - 1);
        System.out.println(traversalRecursive.inOrderTraversal(ans));
    }

    public static BinaryTreeNode helper(ArrayList<Integer> post, int left, int right) {
        if (left > right) {
            return null;
        }
        int index = postIndex--;
        BinaryTreeNode node = new BinaryTreeNode(post.get(index));
        node.right = helper(post, map.get(node.val) + 1, right);
        node.left = helper(post, left, map.get(node.val) - 1);
        return null;
    }

}
