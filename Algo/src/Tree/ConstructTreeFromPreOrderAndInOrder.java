package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreOrderAndInOrder {

    static int preIndex = 0;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        TreeTraversalRecursive traversalRecursive = new TreeTraversalRecursive();
        BinaryTreeNode root = BinaryTreeNode.makeTree();
        ArrayList<Integer> pre = traversalRecursive.preOrderTraversal(root);
        ArrayList<Integer> in = traversalRecursive.inOrderTraversal(root);
        for (int i = 0; i < in.size(); i++) {
            map.put(in.get(i), i);
        }
        BinaryTreeNode ans = ConstructTreeFromPreOrderAndInOrder.helper(pre, 0, in.size() - 1);
        System.out.println(traversalRecursive.inOrderTraversal(ans));
    }

    public static BinaryTreeNode helper(ArrayList<Integer> pre, int left, int right) {
        if (left > right) {
            return null;
        }
        BinaryTreeNode node = new BinaryTreeNode(pre.get(preIndex++));
        node.left = helper(pre, left, map.get(node.val) - 1);
        node.right = helper(pre, map.get(node.val) + 1, right);
        return null;
    }

}
