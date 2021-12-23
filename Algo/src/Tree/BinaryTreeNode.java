package Tree;

public class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int val) {
        this.val = val;
    }

    public static BinaryTreeNode makeTree() {
        //            5
        //        3        7
        //    2      4   6    8
        BinaryTreeNode root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(2);
        root.left.right = new BinaryTreeNode(4);
        root.right = new BinaryTreeNode(7);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(8);

        return root;
    }

    @Override
    public String toString() {
        return this.val + " ";
    }
}
