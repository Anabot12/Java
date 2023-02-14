import java.util.Scanner;
public class Crc
    {
        public static String XOR(String a, String b)
        {
            int n=a.length();
            String res="";
            for(int i=0;i<n;i++)
            {
                if(a.charAt(i)==b.charAt(i))
                {
                    res=res+'0';
                }
                else
                {
                    res=res+'1';
                }
            }
            return res;
        }
    
        public static String modulo2(String divisor, String dividend)
        {
            int n1=divisor.length();
            String div= dividend.substring(0,n1);
    
            //add ending bits
    
            for (int i=0; i<n1-1; i++){   //ending bits
                dividend=dividend+'0';
            }
    
            String zero="";
    
            for (int i=0; i<n1; i++){   //ending bits
                zero=zero+'0';
            }
    
            int n2=dividend.length();
    
            while(n1<n2)
            {
    
                if(div.charAt(0)==divisor.charAt(0))
                {
                    div=XOR(divisor,div)+dividend.charAt(n1);
    
                }
                else
                {
                    div=XOR(zero,div)+dividend.charAt(n1);
                }
                div=div.substring(1, div.length());
                if (n1==n2-1){
                    div=div.substring(1, div.length());
                    return div;
                }
                n1+=1;
            }
    
    
            return div;
        }
        public static void main(String args[])

    {
    
        System.out.println("Choose any 1 polynomial out of the following for CRC:\n1.CRC-8\n2.CRC-12\n3.ITU-16\n4.ITU-32\n");
        try (Scanner sc = new Scanner(System.in)) {
            String a,b,poly,res;
            poly = sc.next();

            switch(poly) 
            {
                case "1":
                    a="100000111";
                    b="1011";
                    res=modulo2(b,a);
                    System.out.println(res);
                    break;
                case "2":
                    a="11000110101";
                    b="1011";
                    res=modulo2(b,a);
                    System.out.println(res);
                    break;
                case "3":
                    a="10001000000100001";
                    b="1011";
                    res=modulo2(b,a);
                    System.out.println(res);
                    break;
                case "4":
                    a="100000100110000010001110110110111";
                    b="1011";
                    res=modulo2(b,a);
                    System.out.println(res);
                    break;

            }
        }
    }
    

  
}

