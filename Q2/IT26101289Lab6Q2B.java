import java.util.Scanner;

public class IT26101289Lab6Q2B {
    public static void main(String[] args) {
		int num,count;
        Scanner input = new Scanner(System.in);
		
		count = 1;
		num = 0;
		
		while (count<=10){
			System.out.print("Enter the number");
			num=input.nextInt();
			
			System.out.print(num);
			count++;
		}
        
        }
	
	}