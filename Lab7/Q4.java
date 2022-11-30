package Lab7;
import java.util.Scanner;
class direction extends Exception
{
    direction()
    {
        super("collison");
    }
}
public class Q4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the directions: Same or Opposite");
        String a=sc.nextLine();

        try
        {
            if (a.equals("Opposite"))
                {
                    throw new direction();
                }
                else
                {
                    System.out.println("No issues");
                }
        }  
    }
    
}
