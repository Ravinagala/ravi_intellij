package ravi_intellij;

public class FinallyTest {
    public static void main(String[] args) {
        method("5");
        method("abc");
        method("0");
    } // end of main()
    public static void method(String value){
        try {
            int n = Integer.parseInt(value);

            System.out.println(100 / n);
        }
         catch(NumberFormatException | ArithmeticException ex) {
            System.out.println("Invalid number!");
        }
         finally {
            System.out.println("Finally block.");
        }
        System.out.println("**Method Completed**");
    } // end of method()
}
