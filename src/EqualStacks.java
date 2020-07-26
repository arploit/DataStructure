import java.util.Stack;

/**
 * Created for UdemyJava on Jul,2020
 */
public class EqualStacks {

    static int StackHeight(int h1[], int h2[], int h3[]){
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        Stack<Integer> s3 = new Stack();
        int sum1 = 0 , sum2 = 0 , sum3 = 0;
        for(int i=h1.length-1;i>=0;i--){
            s1.push(h1[i]);
            sum1+=h1[i];
        }
        for(int i=h2.length-1;i>=0;i--){
            s2.push(h2[i]);
            sum2+=h2[i];
        }
        for(int i=h3.length-1;i>=0;i--){
            s3.push(h3[i]);
            sum3+=h3[i];
        }

        while(!(sum2 == sum3 && sum3 == sum1)){
            if(sum1==0||sum2==0||sum3==0){
                sum1=0;
                break;
            }
            if(sum1<sum2){
                sum2 -=s2.peek();
                s2.pop();
            }
            if(sum1<sum3){
                sum3-=s3.peek();
                s3.pop();
            }
            if(sum2<sum1){
                sum1 -=s1.peek();
                s1.pop();
            }
            if(sum2<sum3){
                sum3 -=s3.peek();
                s3.pop();
            }
            if(sum3<sum1){
                sum1 -=s1.peek();
                s1.pop();
            }
            if(sum3<sum2){
                sum2 -=s2.peek();
                s2.pop();
            }
        }


        return sum1;
    }

    public static void main(String[] args) {

        int [] h1 = {1,1,1,2,3};
        int [] h2 = {3,2,4};
        int [] h3 = {1,4,1,1};

        int k = StackHeight(h1,h2,h3);

        System.out.println(k);

    }
}
