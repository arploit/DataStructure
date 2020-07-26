/**
 * Created for UdemyJava on May,2020
 */
public class StringClassDemo {
    /*Class 80*/
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String s = "Hello world!";
        System.out.println("s:"+ s);

        /*comparison*/

        System.out.println("\ns.equals(\"Hello world!\"):   "+ s.equals("Hello World!"));
        System.out.println("s.equalsIgnoreCase(\"HellO world!\"):   "+ s.equalsIgnoreCase("Hello World!"));
        System.out.println("s.compareTo(\"hello world!\"):   "+ s.compareTo("hello world!"));


        /*Searching*/
        System.out.println("\ns.contains(\"Hello world!\"):   "+ s.contains("Hello World!"));
        System.out.println("\ns.contains(\"Hello World!\"):   "+ s.contains("world!"));
        System.out.println("\ns.startsWith(\"Hello world!\"):   "+ s.startsWith("Hello World!"));
        System.out.println("\ns.startswith(\"hello world!\"):   "+ s.startsWith("Hello world!"));
        System.out.println("\ns.endsWith(\"!\"):   "+ s.endsWith("!"));
        System.out.println("\ns.indexOf(\"lo\"):   "+ s.indexOf("lo"));
        System.out.println("s.indexof(\"o\"):   "+ s.indexOf('o'));
        System.out.println("s.lastIndexof(\"oo\"):   "+ s.lastIndexOf("o"));

    }
}
