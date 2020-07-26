import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.Stack;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            s1.push(a[i]);
        }

        for (int i = b.length - 1; i >= 0; i--) {
            s2.push(b[i]);
        }
        int k = 0;

        while (true) {
            if (s1.peek() >= s2.peek()) {

                if ((x - s1.peek()) > 0) {
                    x = x - s1.peek();
                    s1.pop();
                    k += 1;

                } else if ((x - s2.peek()) >= 0) {
                    x = x - s2.peek();
                    s2.pop();
                    k += 1;
                } else break;
            } else if (s1.peek() <= s2.peek()) {
                if ((x - s2.peek()) > 0) {
                    x = x - s2.peek();
                    s2.pop();
                    k += 1;
                } else if ((x - s1.peek()) >= 0) {
                    x = x - s1.peek();
                    s1.pop();
                    k += 1;
                } else break;
            } else break;
        }


        return k;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];
            /*int[] a = {7 ,15 ,12, 0,5 ,18 ,17 ,2 ,10 ,15 ,4, 2 ,9 ,15 ,13 ,12 ,16};*/


            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            /* int[] b = {12 ,16, 6, 8 ,16 ,15 ,18, 3 ,11, 0 ,17, 7 ,6, 11, 14, 13 ,15, 6 ,18, 6, 16 ,12 ,16 ,11 ,16 ,11};*/
            int[] b = new int[m];
            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            System.out.println(result);
        }

    }

}

