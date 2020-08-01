import java.util.Scanner;

/**
 * Created for UdemyJava on Jul,2020
 */
public class PostOrder {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
        }

    }

    static void addNode(int d) {
        Node treenode = new Node(d);
        treenode.left = null;
        treenode.right = null;

        if (root == null) {
            root = treenode;
        } else {
            Node FocusNode = root;
            Node parentNode;
            while (true) {
                parentNode = FocusNode;

                if (d < FocusNode.data) {
                    FocusNode = FocusNode.left;
                    if (FocusNode == null) {
                        parentNode.left = treenode;
                        return;
                    }

                } else {
                    FocusNode = FocusNode.right;
                    if (FocusNode == null) {
                        parentNode.right = treenode;
                        return;
                    }

                }

            }


        }
    }

    static void PostOrdertrav(Node node) {

        if (node == null)
            return;
        else {
            PostOrdertrav(node.left);
            PostOrdertrav(node.right);
            System.out.print(node.data + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            addNode(scan.nextInt());

        }
        PostOrdertrav(root);

    }

}
