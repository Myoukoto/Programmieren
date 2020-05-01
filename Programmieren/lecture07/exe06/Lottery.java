package exe06;

public class Lottery 
{
	public static void main(String[] args)
	{
		int[] luckynumber=new int[6];
		//generates 6 nonrepeating number ranging from 1 to 49 (lotterynumbers)
		for (int i=0;i<luckynumber.length;i++)
		{
			luckynumber[i]=(int)(Math.random()*49+1);
			for (int j= 0;j<i;j++)
			{
				if(luckynumber[i]==luckynumber[j])
				{
					i=i-1;
				}
			}
		}
		// sorts the numbers from lowest to highest with minsort procedure
		for (int k= 0;k<luckynumber.length;k++)
		{
			for(int l=k;l<luckynumber.length;l++)
			{
				if(luckynumber[k]>luckynumber[l])
				{
					luckynumber[l]=luckynumber[l]+luckynumber[k];
					luckynumber[k]=luckynumber[l]-luckynumber[k];
					luckynumber[l]=luckynumber[l]-luckynumber[k];
				}
			}
			System.out.print(luckynumber[k]+" ");
		}
		System.out.print("are your lottery numbers");
	}
}
