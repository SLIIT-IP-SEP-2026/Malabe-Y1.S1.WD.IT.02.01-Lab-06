import java.util.Scanner;
public class IT26101506Lab6Q2C{
	public static void main(String[] args){
	
	int sum = 0;
	double Average;
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter number 1: ");
    int num1=input.nextInt();
	
	System.out.print("Enter number 2: ");
    int num2=input.nextInt();
	
	System.out.print("Enter number 3: ");
    int num3=input.nextInt();
	
	System.out.print("Enter number 4: ");
    int num4=input.nextInt();
	
	System.out.print("Enter number 5: ");
    int num5=input.nextInt();
	
	System.out.print("Enter number 6: ");
    int num6=input.nextInt();
	
	System.out.print("Enter number 7: ");
    int num7=input.nextInt();
	
	System.out.print("Enter number 8: ");
    int num8=input.nextInt();
	
	System.out.print("Enter number 9: ");
    int num9=input.nextInt();
	
	System.out.print("Enter number 10: ");
    int num10=input.nextInt();
	
	sum=sum+num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
    Average=sum/10.0;
	
    System.out.println("The number you entered are: "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10);
    System.out.println("Sum of the numbers: "+sum);
    System.out.println("Average of the numbers: "+Average);
}
}