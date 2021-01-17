//Question: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem?isFullScreen=true
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryLowest {

    Node Temp;
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if(v1>v2){
        v1 = v1^v2;
        v2 = v1^v2;
        v1 = v1^v2;
        }
        if(root.data == v1 || root.data ==v2) return root;
        else if(root.data > v1 && root.data <v2) return root;
        else if(root.data < v1 && root.data <v2) root = lca(root.right, v1,v2);
        else root = lca(root.left,v1,v2);

        return root;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int [] t = new int[]{4 ,2 ,3 ,1 ,7 ,6};


    Node root = null;
    for (int i = 0 ; i<t.length;i++) {
        int data = t[i];
        root = insert(root, data);
    }
    int v1 = 3;
    int v2 = 1;
    scan.close();
    Node ans = lca(root,v1,v2);
    System.out.println(ans.data);
}

}
