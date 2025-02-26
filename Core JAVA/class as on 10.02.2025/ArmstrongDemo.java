// input a range from user and print all the  armstrong numbers from that range
public  package pack1;

import java.util.Scanner;

public class ArmstrongDemo 
{
	public int countDigits(int num)  // num=123
	{
		int digits=0; // digits =0
		while(num!=0) // 0 != 0 false
		{
			digits++; // digits = 0+1=1 +1= 2 +1=3
			num/=10;  // num = 123/10; num = 12/10=1/10= 0
		}
		
		
		return digits; // 3
	}
	
	public int calculatePower(int n, int p)
	{
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result*=n; // result=result*n
		}
		
		return result;
	}
	public static void main(String[] args) 
	{
		
		
		ArmstrongDemo ad=new ArmstrongDemo();
		//	check whether a number is armstrong or not
		// step 1: the number of digits
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();// input number : num=123
		
		int countDigits = ad.countDigits(num); // call function to count digits
//		countDigits = countDigits(123);,  countDigits = 3
		System.out.println("Number of Digits : "+countDigits);// 3
		
//		Step 2 : calculate the power of each digit and sum all the answers 
		int sum=0;
		
		for(int x=num;x!=0;x/=10) // x=123
		{
			int digit = x%10; // 3
			int result = ad.calculatePower(digit,countDigits);
			System.out.println("Result of n : "+result);
			sum+=result;
			System.out.println("Sum : "+sum);
//			x/=10;
		}
//		step 3: compare the value of sum with number to check if they are equal or not
//		if both are same, then print number is armstrong
		if(sum == num) System.out.println(num+" is an Armstrong number");
		else System.out.println(num+" is not an Armstrong number");
	}
} 
