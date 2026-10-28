import java.util.Scanner;

public class IT26102771Lab6Q2B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int i = 1;
        String numbers = "";

               while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = scn.nextInt();
            
                        numbers = numbers + num + " ";
            i++;
        }

     
        System.out.println(" The numbers you entered are:");
        System.out.println(numbers);

        
    }
}