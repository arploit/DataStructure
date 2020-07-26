/**
 * Created for UdemyJava on Jul,2020
 */

class Stack<I extends Number> {
    static int Max = 100;
    int top ;
    int []stack = new int[Max];

    boolean isEmpty(){
        return top < 0;
    }
    Stack() {
        top = -1;
    }

    void pop(){
        if(top < 0)
            System.out.println("Stack is underflow");

        else {
            int k = stack[top--] ;
            System.out.println(k +" is poped");

        }
    }

    void push( int  k){
        if(top >= (Max-1))
            System.out.println("Stack is overflowing");

        else{
            stack[++top] = k;
            System.out.println(k +" is pushed");
        }
    }


    void PrintList(){
        if(top < 0 ){
            System.out.println("Stack is underflowing, Empty");

        }
        else{
            int k = 0 ;
            while(k <= top){
                System.out.print(" "+stack[k++] + " ");


            }
        }
    }






}

public class StackMain {

    public static void main(String[] args) {

        Stack<Number> s = new Stack<Number>();
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.pop();
        s.push(70);
        s.push(80);
        s.push(90);
        s.pop();
        s.push(100);
        s.push(99);

        s.PrintList();


    }


}
