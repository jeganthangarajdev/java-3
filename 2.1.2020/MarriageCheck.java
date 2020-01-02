import java.util.Scanner;
public class MarriageCheck 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			int age;
			String gender;
			System.out.println("enter AGE");
			Scanner in =new Scanner(System.in);
			age=in.nextInt();
			System.out.println("enter GENDER");
			gender=in.next();
			if(gender.equals("f"))
			{
				if(age>=18)
				{
					System.out.println("she is eligible to marry");
				}
				else
				{
					System.out.println("she is not eligible to marry");
				}
			}
			else
			{
				if(age>=21)
			
				{
					System.out.println("he is eligible to marry");
				}
				else
				{
					System.out.println("he is not eligible to marry");
				}
			}
	}
}
			
			
				
				
			
			
			
			
	


