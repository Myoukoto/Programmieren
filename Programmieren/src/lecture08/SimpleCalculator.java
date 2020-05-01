package lecture08;
// use in cmd
public class SimpleCalculator
{
	public static void main(String[] args)
	{
		int result=Integer.valueOf(args[0]);
		int i=args.length-1;
		for(int k =1;k<args.length-1;k++)
		{
			if(args[i].equals("+"))
			{
				result=result+Integer.valueOf(args[k]);	
			}
			else
			{
				result=result-Integer.valueOf(args[k]);
			}
		}
	System.out.println(result);
	}
}
