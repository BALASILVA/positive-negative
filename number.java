package positivenegative;

import java.util.Scanner;

public class number {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	sc.close();
	if(num>=0)
	{
		System.out.println("The given number is positive");
	}
	else
	{
		System.out.println("the given number is negative");
	}
}
}
