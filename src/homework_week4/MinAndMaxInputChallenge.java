package homework_week4;
/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {

            public static void minAndMax(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter two numbers to find maximum of two ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a>b){
                    System.out.printf("Between %d and %d, maximum is %d %n ", a,b,a);
                }else {
                    System.out.printf("Between %d and %d, maximum is %d %n", a,b,b);
                }
                int max = Math.max(a,b);
                System.out.printf("maximum value of %d and %d using Math.max() is %d %n", a,b, max);
                System.out.println("Please enter two numbers to find minimum of two");

                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x < y){
                    System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
                }else {
                    System.out.printf("Between %d and %d, minimum Number is %d %n", x, y, y);
                }
                int min = Math.min(x,y);
                System.out.printf("Minimum value of %d and %d using Math.min() is %d %n", x,y,min);

            }


    public static void main(String[] args) {

                minAndMax();
    }
}
