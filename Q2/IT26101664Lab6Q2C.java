import java.util.Scanner;

public class IT26101664Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum;
        double average;

        System.out.println("Please enter 10 numbers:");

        System.out.print("Enter number 1: ");
        numbers[0] = input.nextInt();

        System.out.print("Enter number 2: ");
        numbers[1] = input.nextInt();

        System.out.print("Enter number 3: ");
        numbers[2] = input.nextInt();

        System.out.print("Enter number 4: ");
        numbers[3] = input.nextInt();

        System.out.print("Enter number 5: ");
        numbers[4] = input.nextInt();

        System.out.print("Enter number 6: ");
        numbers[5] = input.nextInt();

        System.out.print("Enter number 7: ");
        numbers[6] = input.nextInt();

        System.out.print("Enter number 8: ");
        numbers[7] = input.nextInt();

        System.out.print("Enter number 9: ");
        numbers[8] = input.nextInt();

        System.out.print("Enter number 10: ");
        numbers[9] = input.nextInt();

        sum = numbers[0] + numbers[1] + numbers[2]
            + numbers[3] + numbers[4] + numbers[5]
            + numbers[6] + numbers[7] + numbers[8]
            + numbers[9];

        average = sum / 10.0;

        System.out.println("\nThe numbers you entered are:");

        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[2] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[4] + " ");
        System.out.print(numbers[5] + " ");
        System.out.print(numbers[6] + " ");
        System.out.print(numbers[7] + " ");
        System.out.print(numbers[8] + " ");
        System.out.println(numbers[9]);

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
