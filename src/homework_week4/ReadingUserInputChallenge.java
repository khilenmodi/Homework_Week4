package homework_week4;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
*/

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        ReadingUserInputChallenge readingUserInputChallenge1 = new ReadingUserInputChallenge();
        readingUserInputChallenge1.readInput();
    }

    private void readInput() {
        Scanner scanner = new Scanner(System.in);
        int validNumber = 1;
        int sum = 0;
        while (validNumber <= 3) {
            System.out.println("Enter number #" + validNumber);
            if (scanner.hasNextInt()) {
                sum = sum + scanner.nextInt();
                validNumber++;
            } else {
                scanner.next();
                System.out.println("Invalid Number");
            }
        }
        scanner.close();
        System.out.println("Sum = " + sum);
    }


}



