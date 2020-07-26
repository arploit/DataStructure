/**
 * Created for UdemyJava on Jul,2020
 */
public class Factorial {

    static int   Fact(int n){
        if(n== 1 || n == 0 )
        {
            System.out.print("1 ");
            return 1 ;

        }

        System.out.println((n * Fact(n -1 )));
        return (n -1);
    }

    static int sum(int n){
        if(n == 0 ){
            return 0;
        }
        return n + sum(n-1);
    }


    static void RevStrng(String s){
        if((s == null)||(s.length()<=1)){
            System.out.print(s+" ");
        }else{
            System.out.print(s.charAt(s.length()-1)+" ");
            RevStrng(s.substring(0,s.length()-1));
        }
    }

    static boolean Palli(String s){

        int i = 0,j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;


            }
            i++;
            j--;

        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(sum(4));
        RevStrng("Arpesh");
        if(Palli("ara"))
            System.out.println("True");            }
}
