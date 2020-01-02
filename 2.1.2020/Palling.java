import java.util.Scanner;

public class Palling 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String x;
		String y="";
		int length,i ;
		int j=0;
		System.out.println("Enter string");
		Scanner in=new Scanner(System.in);
		x=in.next();
		System.out.println(x);
		 length=x.length();
		//System.out.println(x.length());
		j=length-1;
		//System.out.println(x.charAt(4));
		for(i=0;i<length;i++)
		{
			//System.out.println(x.charAt(j));
			y=y+x.charAt(j);
			j=j-1;
		}
		System.out.println(y);
		if (x.equals(y))
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println(" not palindrome");
		}
		}
	}
	


