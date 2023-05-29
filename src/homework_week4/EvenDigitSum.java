package homework_week4;

import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {

            public static void getEvenDigitSum (){
                System.out.println("enter an even digit number :");
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();

                int d;
                int sum =0;
                while (n>0)
                {
                    d = n%10;
                    if(d%2==0) {
                        sum = sum + d;                     }
                    n = n/10;
                }
                System.out.println(sum);
            }

    public static void main(String[] args) {
                getEvenDigitSum();
            }
}
