import java.util.*;

public class Squareof10numbers {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double square ;
		int arr[] = new int[20] ;
		for(int i =1; i<=10; i++)
		{
			System.out.println("Enter number : ");
			arr[i] = sc.nextInt();
		}
		for(int i =1; i<=10; i++)
		{
			 square = arr[i] * arr[i] ;
			 sum = sum + square ; 
		}
		System.out.println("Sum of the squares of the numbers in the array : " + sum ) ;
		
	}
}