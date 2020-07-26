/**
 * Created for UdemyJava on Jul,2020
 */
public class Coin {

    public static int arrangeCoins(int n) {
        int k = 1 ;
        int count = 0 ;
        while (k <= n ){
            count ++;
            n = n- k ;
            k ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }
}
