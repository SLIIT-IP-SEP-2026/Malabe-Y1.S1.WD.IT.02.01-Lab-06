import java.util.Scanner;

public class IT26101289Lab6Q2C{
    public static void main(String[] args) {
		int num,count,sum;
		double Average;
        Scanner input = new Scanner(System.in);
		
		count = 1;
		num = 0;
		sum= 0;
		
		
		while (count<=10){
			System.out.print("Enter the number");
			num=input.nextInt();
			
			System.out.print(num);
			sum=sum+num;
			count++;
		}
		Average=sum/10.0;
		System.out.println("sum"+sum);
		System.out.println("average"+Average);
        
        }
	
	}