public class NumPallingdrom
{
	public static void main (String args[])
	
	{
		int r,sum=0,temp;
		int m=123431;
		int n=m;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
		System.out.println(m+"pallindrome");
		}
		else
		{
			System.out.println(m+"not pallindrome");
		}
   }
}