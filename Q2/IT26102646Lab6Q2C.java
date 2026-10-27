
import java.util.Scanner;

public class IT26102646Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int number;
        int sum = 0;
        double average;
        String result = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            result = result + number + " ";
            sum = sum + number;

            i++;
        }

        average = sum / 10.0;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(result);

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
