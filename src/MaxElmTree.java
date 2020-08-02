import com.sun.source.tree.ParenthesizedTree;

/*FInding The Mazi==ximum Element in the tree*/

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created for UdemyJava on Aug,2020
 */
public class MaxElmTree {

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

    int MaxElement() {

        Queue<Node> Q = new LinkedList<>();

        Node TempNode = root;
        int Max_element = root.data;
        while (TempNode != null) {
            if (Max_element < TempNode.data) {
                Max_element = TempNode.data;
            }

            if (TempNode.left != null)
                Q.add(TempNode.left);
            if (TempNode.right != null)
                Q.add(TempNode.right);

            if (Max_element < TempNode.data) {
                Max_element = TempNode.data;
            }

            if (Q.isEmpty()) TempNode = null;
            else TempNode = Q.remove();
        }


        return Max_element;
    }


    public static void main(String[] args) {
        int[] a = {20, 10, 15, 4, 5, 14, 26};
        MaxElmTree m = new MaxElmTree();
        for (int value : a) m.InsertNode(value);

        System.out.println(m.MaxElement());
    }

}
