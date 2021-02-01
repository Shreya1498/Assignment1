package Assignment;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//for(int i=2;i<=99;i++) 
			if(num%2==0) {
				System.out.println("It is not a prime number \n ");
			}
			else
				System.out.println("The given number is prime \n");
			
		
	}

}
