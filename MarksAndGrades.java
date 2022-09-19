public class MarksAndGrades{
    public static void main(String args[])
    {
        int arr[] = new int[10] ;
        for(int i =0; i < 10; i++)
        {
            arr[i] = Integer.parseInt(args[i]) ;
        }
       
            for(int i =0; i < 10; i++)
        {
            System.out.println(arr[i]) ;

        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
}
System.out.println("Marks\t Grades");
for(int i = 0; i<arr.length; i++)
{
System.out.print(arr[i] + "\t");

if(arr[i] < 40)
System.out.println("FAIL");

else if (arr[i] >= 40 && arr[i] <= 50)
System.out.println("PASS");

else if(arr[i] >= 51 && arr[i] <= 75)
System.out.println("MERIT");

else
System.out.println("DISTINCTION");
      }
    }
}