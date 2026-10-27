import java.util.Scanner;
public class IT26102467Lab6Q1{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);

 System.out.print("Enter a number:");
 int num = input.nextInt(); 
 
 double num2 = num*num;
 double num1 = Math.sqrt(num);

 System.out.println("The square of" +" "+num+" "+"is:"+num2);
 System.out.println("The square root of"+" "+num+ " "+"is:"+num1);




   }
}