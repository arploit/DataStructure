import java.util.function.Predicate;

/**
 * Created for UdemyJava on Jun,2020
 */
public class RlinkedList {
    static Node Head;

    public  static class Node {
        Node next ;
        int data;

         Node (int d){
             next = null;
            data = d;
        }
    }

    public   RlinkedList Insert(RlinkedList list , int d){
        Node new_node = new Node(d);
        new_node.next = null;

        if(list.Head == null){
            list.Head = new_node;

        }
        else{
            Node last = list.Head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;

        }

        return list;

    }

    public  void Printlist (RlinkedList list){
        Node curr_node = list.Head;

        while(curr_node!=null){



                System.out.print(curr_node.data + "->");

            curr_node = curr_node.next;
        }

    }




    public RlinkedList addTwoNumbers(RlinkedList list1, RlinkedList list2){

        Node FirstList = list1.Head;
        Node SecondList = list2.Head;
        RlinkedList list3 = new RlinkedList();
        int temp = 0;
        while(FirstList!=null || SecondList!=null){

            int F = FirstList.data;
            int S = SecondList.data;

            if((F+S) > 10 || temp != 0){
                list3 = Insert(list3 , (F+S+temp)%10);
                temp = (F+S+temp)/10;

            }else{
            list3 = Insert(list3,(F+S));
            temp = 0 ;
            }

            FirstList = FirstList.next;
            SecondList = SecondList.next;
        }



        return list3;




    }

    static void reverse (Node node){
        Node Prev_node,Curr_node,next_node;
        Prev_node = null;
        Curr_node = node;
        next_node = null;
        while(Curr_node != null){
            next_node = Curr_node.next;
            Curr_node.next = Prev_node;
            Prev_node = Curr_node;
            Curr_node = next_node;
        }

        while(Prev_node!=null){
            System.out.println(Prev_node.data);
            Prev_node = Prev_node.next;
        }



    }



    public static Node deleteNode (Node node , int d){
        Node new_node = node ,prev_node = node , next_node = null;

        if(new_node.next == null){
              prev_node = null;
        }else {
            if (d == 0) {
                prev_node = new_node.next;
            } else {

                while (d > 1) {
                    new_node = new_node.next;
                    d = d - 1;
                }

                next_node = new_node.next.next;

                new_node.next = next_node;
            }
        }
        return prev_node;

    }





    public static void main(String [] args){

        RlinkedList list1 = new RlinkedList(),list2 = new RlinkedList();


        list1 = list1.Insert(list1 ,2 );
        list1 = list1.Insert(list1 ,4 );
        list1 = list1.Insert(list1 ,3 );
        list1 = list1.Insert(list1 ,77 );
        list1 = list1.Insert(list1 ,5 );
        list1 = list1.Insert(list1 ,6 );
        list1 = list1.Insert(list1 ,7 );
        list1 = list1.Insert(list1 ,8 );
        list1 = list1.Insert(list1 ,9 );

        reverse(list1.Head);

       // Printlist(list2);

        //Printlist(addTwoNumbers(list1,list2));
        /*
        list1.Head = reverse(list1.Head);

        System.out.println();
        Printlist(list1);w

        */

    }

}
