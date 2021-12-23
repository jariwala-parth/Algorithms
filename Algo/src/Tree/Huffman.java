package Tree;

import java.util.Comparator;
import java.util.PriorityQueue;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

public class Huffman {
    public static void printCode(HuffmanNode root, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    // main function
    public static void main(String[] args) {
        // number of characters.
        int n = 6;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charfreq = {5, 9, 12, 13, 16, 45};
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.data));
        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }
        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode left = q.poll();
            HuffmanNode right = q.poll();
            HuffmanNode f = new HuffmanNode();
            assert right != null;
            f.data = left.data + right.data;
            f.c = '-';
            f.left = left;
            f.right = right;
            root = f;
            q.add(f);
        }
        printCode(root, "");
    }
}
  