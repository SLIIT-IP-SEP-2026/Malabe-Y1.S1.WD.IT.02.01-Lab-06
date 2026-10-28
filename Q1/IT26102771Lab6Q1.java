import java.util.Scanner;

public class IT26102771Lab6Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        double num = scn.nextDouble();

    
        double square = num * num;
        double squareroot = Math.sqrt(num);

        
        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + squareroot);

       
    }
}