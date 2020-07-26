
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeLlist {

        static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;

            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
        }

        static class SinglyLinkedList {
            public SinglyLinkedListNode head;
            public SinglyLinkedListNode tail;

            public SinglyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void insertNode(int nodeData) {
                SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

                if (this.head == null) {
                    this.head = node;
                } else {
                    this.tail.next = node;
                }

                this.tail = node;
            }
        }

        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }

    public static  void Printlist (SinglyLinkedListNode head){
        SinglyLinkedListNode curr_node = head;

        while(curr_node!=null){



            System.out.print(curr_node.data + "->");

            curr_node = curr_node.next;
        }

    }
        // Complete the getNode function below.

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
        static int getNode(SinglyLinkedListNode head, int positionFromTail) {
            SinglyLinkedListNode Curr_node = head , next_node = head;
            int count = 0 ;

            while(head != null){
                count += 1;
                head = head.next;
            }

            for(int i = 0 ; i<count-positionFromTail;i++){
                if(next_node!= null){
                Curr_node = next_node;
                    next_node = next_node.next;
                }
            }



            return Curr_node.data;


        }


    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        if (headA == null && headB == null) return null;
        else if (headA == null) return headB;
        else if (headB == null) return headA;

        if(headA.data >= headB.data) {
            SinglyLinkedListNode temp = headB;
            headB = headB.next;
            temp.next = headA;
            headA = temp;
        }
        headA.next = mergeLists(headA.next,headB);
        return headA;



    }


    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

           SinglyLinkedListNode new_head = head;

            while(head.next != null){
                if(head.data == head.next.data){
                    head.next = head.next.next;
                }else{

                head = head.next;}
            }


            return new_head;

    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)  {
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


            SinglyLinkedList llist1 = new SinglyLinkedList();
  /*          SinglyLinkedList llist2 = new SinglyLinkedList();*/
            llist1.insertNode(3);
            llist1.insertNode(3);
            llist1.insertNode(3);
            llist1.insertNode(4);
            llist1.insertNode(5);
            llist1.insertNode(5);

/*
            llist2.insertNode(3);
            llist2.insertNode(4);

*/


             llist1.head = removeDuplicates(llist1.head);

            Printlist(llist1.head);





        }
    }


