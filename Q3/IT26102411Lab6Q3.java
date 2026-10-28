import java.util.Scanner;

public class IT26102411Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        int count = 0;
        double sumOfSquares = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (num != -99) {
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares += (num * num);
                count++;
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo numbers entered.");
        }

      
    }
}