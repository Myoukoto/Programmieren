package exe05;

public class Coin 
{
	public static void main(String[] args)
	{
	double in =0;
		for(int i=0; i<=10000; i++)
		{
			int euro = (int) (Math.random()*2);// ob drin
			if(euro ==1)
			{
			int drawer= (int)(Math.random()*3)+1;
				if( drawer == 1)
				{
					in = in+1;				
				}
				else		 
				{
					i=i-1;
				}
			}
		}	
	System.out.println(in/10000*100+"% is the approximated probabilty of the coin being in drawer 3");
	}
}
