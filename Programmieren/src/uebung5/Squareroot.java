package uebung5;

public class Squareroot 
{
	public static void main(String[] args)
	{
	double y=1;
	double x=6;
	for (int i=1;i<=10;i++)
	{
		y=(y+x/y)/2;
	}
	System.out.println("The Squareroot of "+x+" equals "+y);
	}
}
