import java.util.LinkedList;
import java.util.Queue;

/**
 * Created for UdemyJava on Aug,2020
 */
public class LevelOrder {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;

        }
    }

    void InsertNode(int d) {
        Node newNode = new Node(d);

        if (root == null) {
            root = newNode;
        } else {
            Node FocusNode = root;
            Node parentNode;
            while (true) {
                parentNode = FocusNode;

                if (d < FocusNode.data) {
                    FocusNode = FocusNode.left;
                    if (FocusNode == null) {
                        parentNode.left = newNode;
                        return;
                    }
                } else {
                    FocusNode = FocusNode.right;
                    if (FocusNode == null) {
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    void LevelOrdTrav(Node root) {
        Queue<Node> Q = new LinkedList<>();

        Node TempNode = root;
        while (TempNode != null) {
            System.out.print(TempNode.data + " ");

            if (TempNode.left != null) {
                Q.add(TempNode.left);
            }
            if (TempNode.right != null) {
                Q.add(TempNode.right);
            }

            if (Q.isEmpty()) TempNode = null;
            else TempNode = Q.remove();
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 5, 3, 6, 4};
        LevelOrder LO = new LevelOrder();
        for (int value : a) LO.InsertNode(value);

        LO.LevelOrdTrav(root);
    }

}
