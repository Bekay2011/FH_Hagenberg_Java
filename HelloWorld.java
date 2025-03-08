/* HelloWorld:                                                               */
/* -----------                                                               */
/* Your first program in Java.                                               */
/* ========================================================================= */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello Java!");
        System.out.println();
        System.out.println("Hello World!");
        System.out.println("Enter your first number: ");
        int a = Input.readInt();
        System.out.println("Enter your second number: ");
        int b = Input.readInt();
        int sum = a + b;

        System.out.println("The sum of the number = " + sum);
        System.out.print("Hello World");
        System.out.println();

        calc(a, b);


    }

    static void calc(int a, int b){

        System.out.printf("Your numbers to calculate are a = %d and b = %d", a, b);
        System.out.println();
        System.out.println("The result of the calculation is = "+ (a+b));

    }
}
