import java.util.Scanner;

public class NewPalindrom 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          String x;
          String y="";
          int length,i,j;
          System.out.println("Enter String");
          Scanner in=new Scanner(System.in);
          x=in.next();
          x=x.toLowerCase();
          length=x.length();
          j=length-1;
         // System.out.println(x.charAt(j));
         
          for(i=0;i<length;i++)
          {
        	  y=y+x.charAt(j);
        	  j=j-1;
          }
          System.out.println(y);
          if(x.equals(y))
          {
            System.out.println("palindrome");
          }
          else
          {
        	  System.out.println("not palindrome");
          }
       }
          
    }
