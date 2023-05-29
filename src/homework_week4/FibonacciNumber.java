package homework_week4;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciNumber {
        public void series() {


            int n = 10, firstTerm = 1, secondTerm = 1;
            System.out.println("Fibonacci series " + n + " terms :");
            for (int i = 1; i<=n; ++i){
                System.out.println(firstTerm + " , ");
                int nextTerm = firstTerm + secondTerm ;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        obj.series();
    }
}
