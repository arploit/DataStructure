/**
 * Created for UdemyJava on Jun,2020
 */
public class ReverseLinkList {
    Node Head;

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static  ReverseLinkList insert(ReverseLinkList list , int data){

        Node new_node = new Node(data);
        new_node.next = null;

        if(list.Head==null){
            list.Head = new_node;
        }else
        {
            Node last = list.Head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;

    }

    public static void PrintList(ReverseLinkList list){

        Node currNode = list.Head;
        while(currNode.next != null){
            System.out.print(currNode.data+" -> ");

         currNode   = currNode.next;
        }

    }


    public static void main(String[] args) {
        ReverseLinkList list = new ReverseLinkList();


        list = insert(list , 1);
        list = insert(list , 2);
        list = insert(list , 3);
        list = insert(list , 4);
        list = insert(list , 5);
        list = insert(list , 6);
        list = insert(list , 7);
        list = insert(list , 8);


        PrintList(list);
    }
}
