package test;
//the given problem is guess the your pin

import java.util.Scanner;

public class Guesspin 
{

  public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
	 int pin =12345;
	 int guesspin;
	 int count=0;
	//this is the initial value for the count
	 
	 Scanner SC =new Scanner(System.in);
	 
	 for(int i=1;i<5;i++) 
	  
	// this is the initial value for the count it will be increment in 3 times
		 count++;
		 System.out.println("Enter the pin");
		 guesspin = SC.nextInt();
		 
		 if(guesspin==pin)
		 {   
			 System.out.println("Correct ,Welcome back");
			 
		
		 }
		 
		 else {
			   System.out.println("Incorrect pin ,plz try again");
			 }
		 
			 if(count==5)
			 {
			 System.out.println("Sorry but you have been  locked out..");
			 
			 count++;
			 }
		 }
	 

	}
