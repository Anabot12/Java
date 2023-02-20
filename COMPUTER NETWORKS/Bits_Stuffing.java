import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Bits_Stuffing 
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Manual Entry or 2. Read File ");
		char s1C = sc.next().charAt(0);
		if (s1C == '1') {
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter the bits:		");
			String s1 = sc.next();
			String current = new String();
			String op = new String();
			
			int count = 0;
			for (int i=0; i<s1.length(); i++) {
				if (s1.charAt(i)<='1' || s1.charAt(i)<='0') {
					if (s1.charAt(i) == '1') {
						count++;
						current = current + s1.charAt(i);
					}
					
					else {
						current = current + s1.charAt(i);
						count = 0;
					}
					
					if (count == 5) {
						current = current + '0';
					}
				}
			}
			System.out.println("The new stuffed string is:	" + current);
		}
		
		else if (s1C == '2') {
			Path fileName = Path.of("C:/Users/dell/Desktop/code/javalab/COMPUTER NETWORKS/ananya.txt");
			String str = Files.readString(fileName);
			StringBuilder binfile = convertStringToBinary(str);
			int lenbf = binfile.length();
			System.out.println("The length of binary file is: " + lenbf);
			
			String current = new String();
			int count = 0;
			for (int i=0; i<binfile.length(); i++) {
				if (binfile.charAt(i)<='1' || binfile.charAt(i)<='0') {
					if (binfile.charAt(i) == '1') {
						count++;
						current = current + binfile.charAt(i);
					}
					
					else {
						current = current + binfile.charAt(i);
						count = 0;
					}
					
					if (count == 5) {
						current = current + '0';
					}
				}
			}
			System.out.println("The new stuffed string is:	" + current);
			
		}
	}

	private static StringBuilder convertStringToBinary(String str) {
		  String s = str;
		  byte[] bytes = s.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++)
		     {
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     //binary.append(' ');
		  }
		  System.out.println("'" + s + "' to binary: " + binary);
		return binary;
	}

}