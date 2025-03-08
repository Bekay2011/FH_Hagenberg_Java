/* HelloWorld:                                                               */
/* -----------                                                               */
/* Your first program in Java.                                               */
/* ========================================================================= */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello Java!");
        System.out.println("Hello World!");
        int a = 5;
        int b = 15;
        int sum = a + b;

        System.out.println(sum);
        System.out.print("Hello World");

        Calc(a, b);


    }

    static void Calc(int a, int b){

        System.out.printf("Your numbers to calculate are a = %d and b = %d", a, b);
        System.out.println();
        System.out.println("The result of the calculation is = "+ (a+b));

    }
}
