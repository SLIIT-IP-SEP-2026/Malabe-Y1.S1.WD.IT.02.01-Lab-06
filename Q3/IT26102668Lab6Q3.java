
import java.util.Scanner;

public class IT26102668Lab6Q3 {
    public static void main(String args[]) {

        int number, count, square;
        double sumofsquares, rms;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        count = 0;
        sumofsquares = 0;

        while (number != -99) {

            if (number < 0) {
                System.out.println("Invalid! Enter a positive number.");
            } else {
                square = number * number;
                sumofsquares = sumofsquares + square;
                count++;
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sumofsquares / count);
            System.out.println("RMS: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }

        input.close();
    }
}
