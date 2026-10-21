import java.util.Scanner;

public class IT26101664Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sum = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {

            if (number > 0) {
                sum = sum + (double) number * number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        if (count > 0) {
            double rms = Math.sqrt(sum / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}