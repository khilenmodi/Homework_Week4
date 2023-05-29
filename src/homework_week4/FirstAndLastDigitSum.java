package homework_week4;
/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class FirstAndLastDigitSum {

        public static int sumFirstAndLastDigit(int num){

            int lastDigit = num %10;
            int firstDigit = num;
            while (firstDigit>=10){
                firstDigit=firstDigit/10;
            }
            return firstDigit+lastDigit;
        }

    public static void main(String[] args) {
            int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the two or three digit number :");
        n = sc.nextInt();
        int sum = sumFirstAndLastDigit(n);
        System.out.println("The sum of First and Last Digit is : " +sum);

    }
}
