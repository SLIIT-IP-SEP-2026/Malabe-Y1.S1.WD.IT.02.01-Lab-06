import java.util.Scanner;
public class IT26101967Lab6Q3{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter a positive number(terminate the input with -99)");
double number=input.nextDouble();
double sum=0;
double count=0;

while(number!=-99){
if(number>0){


sum=sum+number*number;
count++;









}
else{
System.out.println("the number is invalid");





}
System.out.println("Enter a positive number(terminate the input with -99)");
number=input.nextInt();
}
if(count>0){
	double rms=Math.sqrt(sum/count);
	System.out.println("the root mean square:"+rms);
	
	
}

System.out.println("Terminate the programm");

}





}




