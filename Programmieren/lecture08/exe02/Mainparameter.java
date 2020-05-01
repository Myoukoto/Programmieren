package exe02;
//use it on normal windows console to multiplicate 2 Integers
public class Mainparameter
{
	public static void main(String[] args)
	{
		for (int i = 0;i < args.length;i++)
		{
			if (i>=2)
			{
				System.out.println("You gave too many arguments");
				break;
			}
		}
		System.out.println(Integer.valueOf(args[0])*Integer.valueOf(args[1]));
	}
}