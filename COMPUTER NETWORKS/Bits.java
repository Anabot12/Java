import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Bits {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Entry or 2. Read File (Enter 1 or 2)");
		char ananyaC = sc.next().charAt(0);
		if (ananyaC == '1') {
			//Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of bits:		");
			String ananya = sc.next();
			String current = new String();
			String anu= new String();
			
			int count = 0;
			for (int i=0; i<ananya.length(); i++) {
				if (ananya.charAt(i)<='1' || ananya.charAt(i)<='0') {
					if (ananya.charAt(i) == '1') {
						count++;
						current = current + ananya.charAt(i);
					}
					
					else {
						current = current + ananya.charAt(i);
						count = 0;
					}
					
					if (count == 5) {
						current = current + '0';
					}
				}
			}
			System.out.println("The new stuffed string is:	" + current);
		}
	

		else if (ananyaC == '2') {
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
		  for (byte b : bytes);
		{
			int val = 2;
			for (int i = 0; i < 8; i++)
			{
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
		     
		
		}
		{
			System.out.println("'" + s + "' to binary: " + binary);
			return binary;
		}
	}

}
