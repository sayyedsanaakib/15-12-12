package test;
//The given program is count the digits


import java.util.Scanner;

public class CountDigits
{

	 static Scanner SC =new Scanner(System.in);
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	          int Count =0;
	           long num;

	System.out.println("Enter the Number");
	num =SC.nextLong();

	while(num !=0)
	{
		num=num/10;
		Count++;
	}

	System.out.println("the number of digits :"+Count);

		}

	}

