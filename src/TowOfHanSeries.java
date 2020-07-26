import java.sql.SQLOutput;

/**
 * Created for UdemyJava on Jun,2020
 */
public  class TowOfHanSeries {

  public   static int PrintSeries(int n ){
      if(n == 0 ) {
          System.out.println("1 ");
        return 1;

      }
      System.out.println(PrintSeries(n-1));
        return (int) ((n-1) +(Math.pow(2,n-1)));
    }



    public static void main(String[] args) {
      int k = PrintSeries(2);

        System.out.println();
    }
}