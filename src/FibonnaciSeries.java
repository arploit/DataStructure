/**
 * Created for UdemyJava on Jun,2020
 */
public class FibonnaciSeries {

    static int PrintSeries(int n){
             if (n <= 1)
                return n;
             return PrintSeries(n-2) + PrintSeries(n - 1);

    }

    public static void main(String[] args) {

        System.out.println( PrintSeries(3));
    }

}
