import java.util.Scanner;
public class IT26101731Lab6Q3{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	int number,squareSum,count,square;
	double Root_Mean_Square;
	squareSum=0;
	count=0;
	System.out.print("Enter a number:");
	number=input.nextInt();
	
	while(number!=-99){
	if(number>0){
	count=count+1;
	square=number*number;
	squareSum=squareSum+square;
	
	System.out.print("Enter a number:");
	number=input.nextInt();
	}
	else{
	System.out.print("Invalid input");
	break;
	}
	}
	Root_Mean_Square=Math.sqrt(squareSum/count);
	System.out.print("The Root Mean Square is: "+Root_Mean_Square);
	}
}