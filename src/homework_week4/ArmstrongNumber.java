package homework_week4;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class ArmstrongNumber {

    static boolean isArmstrong(int a) {
        int temp, digits = 0, last = 0, sum = 0;

        temp = a;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = a;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (a == sum)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        num = sc.nextInt();
        System.out.println("Armstrong Number up to " + num + " are  :");

        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}