import java.util.Scanner;

public class IT26102411Lab6Q1{
   public static void main(String[]args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a number:");
     double number =  input.nextDouble();

     double square = number*number;
     double square_root = Math.sqrt(number);

     System.out.println("The square of "+ number + "is:" + square);
     System.out.println("The square root of" + number + "is:" + square_root);


 
  }
}