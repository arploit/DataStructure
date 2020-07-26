/**
 * Created for UdemyJava on Jun,2020
 */
public class TowerOfHanoi {

   static int count = 0 ;
public static int TowerOfHanoiMoves(int n, String Frompeg, String Topeg,String Auxpeg){


    if(n == 1){
        count += 1 ;
        System.out.println("Move disk " +n + " from peg "+Frompeg + " to peg "+ Topeg );
        return count ;
    }

    TowerOfHanoiMoves(n-1, Frompeg , Auxpeg , Topeg);
     count +=1;
    System.out.println("Move disk "+ n + " from peg " + Frompeg + " to peg " + Topeg);

    TowerOfHanoiMoves(n-1, Auxpeg , Topeg,Frompeg  );
    return count ;

}


    public static void main(String[] args) {

        System.out.println( TowerOfHanoiMoves(4 , "A" , "B", "C"));
    }

}
