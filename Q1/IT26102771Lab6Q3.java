import java.util.Scanner;

public class IT26102771Lab6Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        double sos = 0.0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = scn.nextInt();


            if (num == -99) {
                break;
            }
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate ");
                continue;
            }

      
            sos += (num * num);
            count++;
        }

   
        if (count > 0) {
            double Rms = Math.sqrt(sos / count);
            System.out.println("The Root Mean Square (RMS) is: " + Rms);
        }

    
    }
}