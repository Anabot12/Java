package lab4;

import java.util.Scanner; 

public class Combinations { 
 
	public static void main(String[] args) { 
		Scanner scannerObj = new Scanner(System.in); 
 
		System.out.println("Enter The First Number"); 
		int firstNum = scannerObj.nextInt(); 
 
		System.out.println("Enter The Second Number"); 
		int secondNum = scannerObj.nextInt();
 
		System.out.println("Enter The Third Number"); 
		int thirdNum = scannerObj.nextInt();
 
		int[] arr = { firstNum, secondNum, thirdNum }; 
 
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 3; j++) { 
				for (int k = 0; k < 3; k++) { 
					if (arr[i] != arr[j] && arr[j] != arr[k] && arr[k] != arr[i]) {
						System.out.println(arr[i] + "" + arr[j] + "" + arr[k]); 
					} 
				} 
			} 
		} 
		scannerObj.close(); 
	} 
}