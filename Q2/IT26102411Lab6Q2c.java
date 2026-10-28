import java.util.Scanner;

public class IT26102411Lab6Q2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        int i = 1;
        String result = "";
        int total = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            result = result + num + " ";
            total = total + num;
            i++;
        }

        double avg = total / 10.0;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(result);
        System.out.println("Sum of the numbers: " + total);
        System.out.println("Average of the numbers: " + avg);

        
    }
}