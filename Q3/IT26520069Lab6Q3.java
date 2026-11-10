
import java.util.Scanner;

public class IT26520069Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumSquares = 0;

        while (true) {
            System.out.print("Enter a positive number (-99 to stop): ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Negative numbers are not allowed!");
                continue;
            }

            sumSquares = sumSquares + (double) number * number;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);

            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}
