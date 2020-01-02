import java.util.Scanner;

public class Switch
{
    public static void main(String args[])
    {
    Scanner in =new Scanner(System.in);
    int a,b,c,x;
    System.out.println("enter a");
    a=in.nextInt();
    System.out.println("enter b");
    b=in.nextInt();
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");
        System.out.println("enter your choice");
        x=in.nextInt();
        switch (x)
        {
            case 1:
                c=a+b;
                System.out.println("the sum of"+a+ "&" +b+ "is"+ c);
                break;
            case 2:
                c=a-b;
                System.out.println("the sum of "+a+"&"+b+ "is "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("the sum of"+a+ "&" +b+ "is"+ c);
                break;
            case 4:
                c=a%b;
                System.out.println("the sum of"+a+ "&" +b+ "is"+ c);
                break;
            default:
                System.out.println("no choices found");
                break;
        }   
   }
}

