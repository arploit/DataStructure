import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Created for UdemyJava on Aug,2020
 */
public class TopOrderView {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }

    }

    static void InsertNode(int d) {
        Node newNode = new Node(d);
        if (root == null) {
            root = newNode;

        } else {
            Node FocusNode = root, parentNode;

            while (true) {
                parentNode = FocusNode;
                if (d < FocusNode.data) {
                    FocusNode = FocusNode.left;
                    if (FocusNode == null) {
                        parentNode.left = newNode;
                        break;
                    }
                } else {

                    FocusNode = FocusNode.right;
                    if (FocusNode == null) {
                        parentNode.right = newNode;
                        break;
                    }

                }
            }
        }
    }

    static void getVerticalOrder(Node Node, int hd, TreeMap<Integer, Vector<Integer>> m) {
        if (Node == null)
            return;

        Vector<Integer> get = m.get(hd);

        if (get == null) {
            get = new Vector<>();
        }
        get.add(Node.data);

        m.put(hd, get);

        getVerticalOrder(Node.left, hd - 1, m);
        getVerticalOrder(Node.left, hd + 1, m);
    }


    static void printVerticalOrder(Node node) {
        TreeMap<Integer, Vector<Integer>> m = new TreeMap<>();
        int hd = 0;
        getVerticalOrder(node, hd, m);

        for (Map.Entry<Integer, Vector<Integer>> entry : m.entrySet()) {
            System.out.print(entry.getValue());
        }
    }


    public static void main(String[] args) {

        int[] a = {1, 2, 5, 3, 6, 4};
        for (int value : a) InsertNode(value);

        printVerticalOrder(root);
    }
}
