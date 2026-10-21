import java.util.Scanner;
 public class Lab6Q1{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in); 
   
   System.out.println("Enter a number");
   int num = input.nextInt();
   
   int square = num* num;
   System.out.println("The square of " + num + " is : " + square);

   double square_root = Math.sqrt(num);
   System.out.println("The square root of " + num + " is : " + square_root);
  }
 }