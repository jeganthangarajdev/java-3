import java.util.Scanner;

public class GstCal
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		int x,gst;
		System.out.println("enter amt");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		gst=x*18/100;
		if(gst==180)
		{
			
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		
		
	}

}
