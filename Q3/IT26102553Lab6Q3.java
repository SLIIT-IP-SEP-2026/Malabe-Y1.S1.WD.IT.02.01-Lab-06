
import java.util.Scanner;

public class Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, count = 0;
        double sum = 0, rms;

        System.out.print("Enter a positive number");
        number = input.nextInt();

        while (number != -99) {

            if (number < 0) {
                System.out.println("Invalid input! Enter positive numbers only.");
            }
            else {
                sum = sum + (number * number);
                count++;
            }

            System.out.print("Enter a positive number");
            number = input.nextInt();
        }

        if (count > 0) {
            rms = Math.sqrt(sum / count);
            System.out.println("Root Mean Square = " + rms);
        }
        else {
            System.out.println("No valid numbers entered.");
        }

    }
}
