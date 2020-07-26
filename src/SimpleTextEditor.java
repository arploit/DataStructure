import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created for UdemyJava on Jul,2020
 */
public class SimpleTextEditor {
    public static void main(String[] args) throws IOException {
        Scanner Scan  = new Scanner(System.in);
        String Str ="";
        int q = Scan.nextInt();
        Stack<String> stack = new Stack<>();

        for(int i  = 0 ; i< q;i++){
            int t = Scan.nextInt();

            switch ( t ){
                case 1 :
                    String s = Scan.nextLine();
                    Str = append(Str , s , stack);
                    break;
                case 2:
                    int k = Scan.nextInt();
                    Str = delete(Str , k , stack);
                    break;
                case 3:
                    int y = Scan.nextInt();
                    printChar(Str, y);
                    break;
                case 4:
                    Str = undo(stack);

            }



        }


    }

    private static String undo(Stack<String> stack) {
        stack.pop();
        return stack.peek();
    }

    private static void printChar(String str, int y) {
        System.out.println(str.charAt(y-19));
    }

    private static String delete(String str, int k, Stack<String> stack) {
        str = str.substring(0,str.length() - k);
        stack.push(str);
        return str;

    }

    private static String append(String str, String s, Stack<String> stack) {

        str = str.trim()+s;
        stack.push(str);

    return str;

    }
}
