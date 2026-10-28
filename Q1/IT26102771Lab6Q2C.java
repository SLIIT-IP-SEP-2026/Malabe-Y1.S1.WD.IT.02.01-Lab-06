import java.util.Scanner;

public class IT26102771Lab6Q2C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int i = 1;
        String numbers = "";
        int sum = 0; 

     
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = scn.nextInt();
            
        
            numbers = numbers + num + " ";
            
       
            sum = sum + num;
            
            i++;
        }

    
        double average = (double) sum / 10;

        
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

      
    }
}