public class Hamming {
  
    public static int[] generate(int[] data) {
      int m = (int) (Math.log(data.length) / Math.log(2)) + 1;
      int[] hammingCode = new int[data.length + m];
    
      for (int i = 0; i < data.length; i++) {
        hammingCode[(int) (Math.pow(2, i)) - 1] = data[i];
      }
    
      for (int i = 0; i < m; i++) {
        int p = (int) Math.pow(2, i);
        for (int j = p - 1; j < hammingCode.length; j = j + (p * 2)) {
          for (int k = j; k < j + p && k < hammingCode.length; k++) {
            hammingCode[p - 1] = hammingCode[p - 1] ^ hammingCode[k];
          }
        }
      }
    
      return hammingCode;
    }
    
    public static void main(String[] args) {
      int[] data = {1, 0, 1, 1};
      int[] hammingCode = generate(data);
    
      System.out.print("Data bits: ");
      for (int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
      }
      System.out.println();
    
      System.out.print("Hamming code: ");
      for (int i = 0; i < hammingCode.length; i++) {
        System.out.print(hammingCode[i] + " ");
      }
      System.out.println();
    }
  }