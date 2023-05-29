package homework_week4;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {

    public static void SpecialCharRightTriangle (int n){
        int a, b;
        for (a=0; a<n; a++){
            for (b =0; b<=a; b++){
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k =5;
        SpecialCharRightTriangle(k);
    }
}