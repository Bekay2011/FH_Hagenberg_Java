public class Mean {
    public static void main(String[] args) {
        //TO DO
        // read a value
        // while value > 0
        // calculate sum , increase count , read next value

        // if count is zero --> no mean
        // else mean is sum by count

        int sum = 0;
        int count = 0;

        int value = Input.readInt();
        while (value > 0) {
            sum += value;
            count++;  
            value = Input.readInt();
        }
        if (count ==0 ) {
            System.out.println("No Mean");
            
        } else {
            double result = (double)sum /count;
            System.out.println("Sum = " + sum);
            System.out.println("Count = " + count);
            System.out.println("Mean = " + result);
            System.out.printf("Mean = %.2f", result);
            System.out.println();
            System.out.printf("Mean 2 = %.2f", result);
        }

    }
    
}
