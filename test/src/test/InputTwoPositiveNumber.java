package test;
import java.util.Scanner;



public class InputTwoPositiveNumber
{

	public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			int sum=0, sum1=0;
			int num1=0, num2=0, num3=0, num4=0;
			Scanner input =new Scanner(System.in);
			System.out.println("Enter the first Number");
			num1=input.nextInt();
			
			num3=num1;
			System.out.println("Enter the Second Number first number will be smaller than second number");
			num2=input.nextInt();
			
			num4=num2;
			if(num1>num2) 
			{
				System.out.println("your first number will be greater than second number ,plz enter again");
				num1=input.nextInt();
			}
			
			else 
			{
				System.out.println("odd Number");
				while(num1<=num2)
				{
					if(num1%2 !=0)
					{
						System.out.println(num1);
					}
					
					if(num1%2 !=0)
					{
						sum+=num1;
					}
					num1++;
					}
				
				System.out.println("sum of odd Number:" + sum);
				
				System.out.println("even number is :");
				while(num3<=num4)
				{
					System.out.println(num3);
				}
				
				if(num3%2 ==0) 
				{
					sum+=num3;
				}
				num3++;
			}
			
			System.out.println("sum of even Number:" + sum1);
	}
}

