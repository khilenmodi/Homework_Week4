package homework_week4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 *  * While loop
 *           *
 *         * * *
 *       * * * * *
 *     * * * * * * *
 *  * * * * * * * * * *
 ** * * * * * * * * * * *
 *  * * * * * * * * * *
 *    * * * * * * * *
 *     * * * * * * *
 *       * * * * *
 *         * * *
 *           *
 */

public class DiamondPattern {

        public void  diamond(){
            int a, b, c;
            System.out.print("input the number of rows :");
            Scanner sc= new Scanner(System.in);
            c = sc.nextInt();
            for (a=0; a<=c; a++ )
            {for (b=1; b<=c-a; b++)
                System.out.print(" ");
             for (b=1; b<=2*a-1; b++)
                 System.out.print("*");
            System.out.print("\n");
            }
            for(a=c-1; a>=1; a--)
            {
             for (b=1; b<=c-a; b++)
                 System.out.print(" ");
              for(b=1; b<=2*a-1; b++)
                  System.out.print("*");
                System.out.print("\n");
            }

        }

    public static void main(String[] args) {
        DiamondPattern obj = new DiamondPattern();
        obj.diamond();
    }
}
