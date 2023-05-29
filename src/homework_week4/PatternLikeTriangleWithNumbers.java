package homework_week4;
/**
 *  Write a program in Java to display the pattern like a triangle with a number.
 For example
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 *
 */

import java.util.Scanner;

public class PatternLikeTriangleWithNumbers {

    public static void triangleWithNumbers() {
        int  z;
        int x =1;
        int y =1;
        System.out.println("Enter number of Rows :");
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();
        for (x = 1; x <=z; x++) {
            for (y = 1; y <= x; y++) {

                System.out.print(" " + y + " ");

            }
            System.out.println("");
        }
    }
        public static void main (String[]args){
            triangleWithNumbers();
        }
    }
