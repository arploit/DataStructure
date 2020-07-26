import java.util.Arrays;
import java.util.Stack;

/**
 * Created for UdemyJava on Jul,2020
 */
public class LargestRectangle {

    static long largestRectangle(int[] h) {

        if(h.length == 0){
            return 0;
        }
        if(h.length == 1){
           return (h[0]);
        }

        int max = 0 ;
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for(int i = 1 ; i < h.length;i++){
            int curr = h[i];
            if(curr >= h[s.peek()]){
                s.add(i);
            }else{
                while(!s.isEmpty() && curr < h[s.peek()]){
                    int temp = h[s.pop()];
                    if(s.isEmpty()){
                        max = Math.max(max ,temp*i);
                    }else{
                        max = Math.max(max, temp*(i-s.peek()-1));
                    }

                }
                s.add(i);
            }
        }
        if(!s.isEmpty()){
            int i = h.length;
            while(!s.isEmpty()){
                int temp = h[s.pop()];
                if(s.isEmpty()){
                    max = Math.max(max ,temp*i);
                }else{
                    max = Math.max(max, temp*(i-s.peek()-1));
                }

            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[] h = {6,2,5,4,5,1,6};
        long result = largestRectangle(h);

        System.out.println(result);
    }
}
