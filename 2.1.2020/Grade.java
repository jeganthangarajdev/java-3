import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
    	System.out.print("Enter grade");
    	Scanner in = new Scanner(System.in);
        String s=in.next();
        char grade = s.charAt(0);
        switch (grade) 
        {
               case 'A':
            	   
                     System.out.println("90 to 100");
                     break;
 
               case 'B':
            	   
                     System.out.println("80 to 89");
                     break;

               case 'C':
            	   
                     System.out.println("70 to 79");
                     break;
                     
               case 'D':
            	   
            	   	System.out.println("50 TO 69");
                    break;
                     
               case 'F':
            	   
                     System.out.println("1 to 59");
                     break;
                     
               default :
                     System.out.println("0");
                     break;
        }
 }
}