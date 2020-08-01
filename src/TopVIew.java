import java.util.Scanner;
import java.util.Stack;

/**
 * Created for UdemyJava on Jul,2020
 */
public class TopVIew {
    static Node root;

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }

    }

    void insertNode(int d) {
        Node treeNode = new Node(d);
        if (root == null) {
            root = treeNode;
        } else {

            Node FocusNode = root;
            Node parentNode;
            while (true) {

                parentNode = FocusNode;

                if (d < FocusNode.data) {
                    FocusNode = FocusNode.left;
                    if (FocusNode == null) {
                        parentNode.left = treeNode;
                        return;
                    }

                } else {
                    FocusNode = FocusNode.right;
                    if (FocusNode == null) {
                        parentNode.right = treeNode;
                        return;
                    }

                }
            }
        }

    }

    public static void topView(Node root) {
        Stack<Integer> stack = new Stack<>();
        if (root != null) {

            Node k = root.left;
            while (k != null) {

                stack.push(k.data);
                k = k.left;
            }

        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        if (root != null) {
            Node a = root;
            while (a != null) {
                System.out.print(a.data + " ");
                a = a.right;
            }
        }


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TopVIew TP = new TopVIew();
        for (int i = 0; i < 15; i++) {
            TP.insertNode(scan.nextInt());
        }
        topView(root);

    }
}
