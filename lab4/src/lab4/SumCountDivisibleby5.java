package lab4;

public class SumCountDivisibleby5 
{
public static void main(String args[])
{
int sum = 0, count = 0;
for (int i = 41; i < 250; i++)
{
    if (i % 5 == 0)
    {
        sum = sum + i;
        count++;
    }
}
System.out.println("The Sum of the number between 40 to 250 which are divisible by 5 is:\n "+sum);
System.out.println("\nTotal numbers between 40 to 250 which are divisible by 5 is:\n "+count);
}
}