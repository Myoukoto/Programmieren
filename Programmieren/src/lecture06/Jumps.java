package lecture06;

public class Jumps 
{
	public static void main(String[] args)
	{
		int jump1=10;
		int jump2=5;
		int distance=25;
		System.out.println("There are "+moreJumps(distance,jump1,jump2)+" different ways to reach the distance of "+distance+" meters.");
	}
	/**
	 *  calculates the amount of variations to reach a certain distance with two given jumps lengths
	 * @param d 	distance to jump
	 * @param smallJump first jump assuming its the smaller one but program works either way
	 * @param bigJump
	 * @return variations
	 */
	public static int moreJumps(int d, int smallJump, int bigJump)
	{
	int	result=0;
	int maxJumps;
	if (bigJump>smallJump)
	{
		maxJumps=d/smallJump;
	}
	else
	{
		maxJumps=d/bigJump;
	}
	for(int i=0;i<=maxJumps;i++)
	{
		int j=0;
		int speicher =smallJump*i;
		if (speicher<d)
		{
			for(;j<=maxJumps-1;)
			{
				j++;
				speicher=speicher+bigJump;
				if(speicher==d) break;
			}
		}
		if (speicher==d)
		{
			result=(int) (result+Factorial.fac(i+j)/(Factorial.fac(i)*Factorial.fac(j)));
		}
		speicher=0;
	}
	return result;	
	}
}
