package homework_week4;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.
 */
public class SharedDigit {

                public static boolean hasSharedDigit (int firstNUmber, int secondNumber){
                    if ((firstNUmber>=10 && firstNUmber<=99) && (secondNumber>=10 && secondNumber<=99)){
                        int firstNumberLastDigit = firstNUmber%10;
                        int secondNumberLastDigit = secondNumber%10;
                        firstNUmber /=10;
                        secondNumber/=10;
                        int firstNumberFirstDigit = firstNUmber;
                        int secondNumberFirstDigit = secondNumber;
                        return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit==secondNumberLastDigit) ||
                                (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit== secondNumberLastDigit));
                    }
                    System.out.println("Invalid input.");
                        return false;

                }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
