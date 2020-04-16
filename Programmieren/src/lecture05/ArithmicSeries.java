package lecture05;

public class ArithmicSeries 
{
	public static void main(String[] args)
	{
		final double EPSILON =1E-5;
		double change;
		int k=1;
		double solution=0;
		do
		{
		change=1/Math.pow(k, 2);
		solution=solution+change;
		System.out.println("The Solution for "+ k +" is "+6*solution);
		k++;
		}
		while(EPSILON<change);
	}
}
