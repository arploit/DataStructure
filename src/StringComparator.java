import java.util.Scanner;

/**
 * Created for UdemyJava on Jul,2020
 */
public class StringComparator {

    static class Stack{
        static int arraylength = 100000000 ;
         int top ;
         char [] charArray = new char[arraylength];

        Stack( ){
            top = -1;

        }

          void push(char c){
            if(top >= (arraylength-1)){
                System.out.println("NO");

            }
            else{
            charArray[++top] = c;
            }

        }

          int pop (char c){
            if(c == ')'){

                    if (charArray[top] == '(') {
                        top -- ;
                        return 1;

                    }


            }
            if(c == '}'){

                    if (charArray[top] == '{') {
                        top -- ;
                        return 1;

                    }


            }
            if(c == ']'){

                    if (charArray[top] == '[') {
                        top -- ;
                        return 1;

                    }
                }




            return 0;
        }





    }







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            if(expression.length()%2 == 0 ){
              Stack s =   new Stack();
                int Flag = 0;
                for(int i = 0 ; i <= (expression.length()-1);i++){
                    if( (expression.charAt(i) == '(') || (expression.charAt(i) == '{') || (expression.charAt(i) == '[') ){
                        s.push(expression.charAt(i));
                    }
                    else if( (expression.charAt(i) == ')') || (expression.charAt(i) == '}') || (expression.charAt(i) == ']') ){
                           int k = s.pop(expression.charAt(i));
                           if(k == 0){
                               Flag = 1;
                               System.out.println("NO");
                               break;
                           }
                    }
                }

                if(Flag == 0 ){
                    System.out.println("YES");
                }

        }
            else
                System.out.println("NO");

        }

        scanner.close();
    }



    
}
