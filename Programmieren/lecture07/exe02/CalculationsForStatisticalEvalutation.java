package exe02;
import java.util.Scanner;
public class CalculationsForStatisticalEvalutation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the amount of Numbers: ");
		int amount =sc.nextInt();
		double[] values = new double[amount];
		if(amount> 0)
		{
			for (int i =1;i<=amount;i++)
			{
			System.out.print("Value " + i + " :\t" );
			values[i-1]=sc.nextDouble();
			}
			System.out.println("Maximum Value:\t" + max(values));
			System.out.println("Minimum Value:\t" + min(values));
			System.out.println("Arithmetic Average:\t" + average(values));
			System.out.println("Standard deviation\t" + deviation(values));
		}
		else
		{
			System.out.println("Error - not a valid input");
		}
		sc.close();
	}
	public static double max(double[] values)
	{
		double max = values[0];
		for (int i=1;i<values.length;i++)
		{
			max=(max < values[i]) ? values[i] : max;
		}
		return max;
	}
	public static double min(double[] values)
	{
		double min = values[0];
		for (int i=1;i<values.length;i++)
		{
			min=(min < values[i]) ? min : values[i];
		}
		return min;
	}
	public static double average(double[]values)
	{
		double average=values[0];
		for (int i=1;i<values.length;i++)
		{
			average=average+values[i];
		}
		average=average/values.length ;
		
		return average;
	}
	public static double deviation(double[]values)
	{
		double average=average(values);
		double deviation=Math.pow(values[0]-average, 2);
		for (int i=1;i<values.length;i++)
		{
			deviation=deviation + Math.pow(values[i]-average, 2);	
		}
		deviation=Math.sqrt(deviation/values.length);
		return deviation;
	}	
}
