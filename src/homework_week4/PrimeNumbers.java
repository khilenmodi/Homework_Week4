package homework_week4;
/**
 * Write a programme to input any number and check if it is prime or not.
 *  * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 *  * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 *  * 17.... are the prime numbers.)
*/

import java.util.Scanner;

public class PrimeNumbers {

private void  isPrime() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is truly prime number or not :");
    int number = sc.nextInt();
    if (isPrime(number)) {
        System.out.println((number + "is prime number"));
    } else {
        System.out.println(number + " is a non prime number");
    }
}
        public boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i=2; i < number / 2; i++) {
            if ((number % i) == 0)
                return false;

        }

     return true;
}

    public static void main(String[] args) {
       PrimeNumbers obj = new PrimeNumbers();
       obj.isPrime();

    }

}
