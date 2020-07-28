import java.util.Scanner;

/**
 * Created for UdemyJava on Jul,2020
 */
public class TreeDS {
    static Node Head;

    static class Node{

        Node left;
        Node right;
        int data;

        Node(int d){
            data =d ;
            left = null;
            right = null;
        }
    }

    void InsertionTree(int d){
        Node treeNode = new Node(d);
        treeNode.left = null ;
        treeNode.right = null;

        if(Head == null){
            Head = treeNode;
        }
        else
            {
                Node FocusNode = Head;
                Node parentNode;
                while(true){

                    parentNode = FocusNode;

                    if(d < FocusNode.data ){
                        FocusNode = FocusNode.left;
                        if(FocusNode == null){
                            parentNode.left = treeNode;
                            return;
                        }
                    }

                    else{
                        FocusNode = FocusNode.right;
                        if(FocusNode  == null){
                            parentNode.right = treeNode;
                            return;
                        }

                    }
                }
            }
    }


     void traversal(Node node){
        if(Head == null){
            System.out.println("Tree is Empty");

        }
        if(node == null)
            return;
        else {

            System.out.print(node.data+" ");
            traversal(node.left);
            traversal(node.right);
        }


    }


    public static void main(String[] args) {

        TreeDS tree = new TreeDS();
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i <6 ;i++){

            tree.InsertionTree(scan.nextInt());

        }
        tree.traversal(Head);


/*Preorder*/

    }

}
