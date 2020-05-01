package exe03;

import java.util.Scanner;

public class PrimenumbersB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in the number to test: \t");
		int number = sc.nextInt(); 
		int i=1;
		boolean primenumber=true;
		while(i<=number) 
		{
		    for(int j = 2; j < i-1; j++) 
		    {
		    	if (i%j == 0)
		    	{	            
		             primenumber = false;		             	            
		        }
		    }
		    if (primenumber && i!=1) 
		    {
		    	System.out.println("Number " + i + " is a Prime number");  
		    }
		    else 
		    {
		    	System.out.println("Number " + i + " is not a Prime number");
		    	primenumber=true;
		    }
		    i++;
		 }
		      sc.close();
	}
	}
	