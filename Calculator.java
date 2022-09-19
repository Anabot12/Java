public class Calculator 
{
public static void main(String[] args)
{
int x = Integer.parseInt(args[0]);
String op = args[1];
int y = Integer.parseInt(args[2]);
int z=0;
if (op.equals("+")) 
{
            z = x+y;
} 
else if (op.equals("-"))
{
            z = x-y;
} 
else if (op.equals("x"))
{
            z = x*y;
 } 
else if (op.equals("/"))
{
            z = x/y;
 } 
else
{
System.out.println("operator doesnt exist");
}
System.out.println(z);
}
}