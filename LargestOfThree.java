public class LargestOfThree
{
public static void main(String args[])
{
int a, b, c ;  
int largest = 0;
a = Integer .parseInt(args[0]) ;
b = Integer .parseInt(args[1]) ;
c = Integer .parseInt(args[2]) ; 
if(a > b && a > c)
{
largest = a ;
}
else if(b>c && b>a)
{
largest = b ; 
}
else
{
largest = c ;
}
System.out.println(largest);
}
}