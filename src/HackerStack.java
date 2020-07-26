import java.util.Scanner;
import java.util.Stack;

/**
 * Created for UdemyJava on Jul,2020
 */
public class HackerStack {

    static class Stack {
        static int MaxEnd = 10000000;
        int top ;
        int [] stackarr = new int[MaxEnd] ;

        Stack(int arr){
            top = -1;
        }

        void push(int d ){
            if(top >= (stackarr.length - 1) ){
                return;
            }
            else {
                stackarr[++top] = d;
            }
        }

        void pop(){
            if (top < 0)
                return;
            else {

                top --;

            }
        }

        void Printlist(){
            int max = 0 ;
            for (int i =0; i <= top;i++ ){
                if(max <= stackarr[i]){
                    max = stackarr[i];
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int vk;
        Stack s = new Stack(k);
        while(k >0){


             vk = scan.nextInt();



                if(vk == 1){
                    int d = scan.nextInt();
                    s.push(d);
                }

                else if(vk == 2) {

                    s.pop();
                }
                else if(vk == 3) {
                    s.Printlist();
                }


            k-- ;
        }




    }
}
