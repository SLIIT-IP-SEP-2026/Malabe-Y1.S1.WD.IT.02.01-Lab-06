import java.util.Scanner;
public class IT26102411Lab6Q2B{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Please enter 10 numbers:");
 int i =0;
 String result ="";
 
  while(i<=10){
     System.out.print("Enter number "+i+ ":");
	 int num = input.nextInt();
	 
	 result = result + num + " ";
     i++;     


  }

   System.out.print("The numbers you entered are:");
   System.out.println(result);


} 
 }