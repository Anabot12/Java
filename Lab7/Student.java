package Lab7;

class Student

{
    public String Name;
    public int Roll_No;
    public Student(){ };
    public Student(String N, int R)
    {
        Name = N;
        Roll_No = R;
        System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
    }
    public void print(String P, int K)
    {
        Name = P;
        Roll_No = K;
        System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
    }
}
class Exception1
{
    public static void main(String[] args)
    {
        Student[] Stu;
        Stu = new Student[10];

        Stu[0] = new Student("Ananya",81);
        Stu[1] = new Student("Astitva",82);
        Stu[2] = new Student("Akshit",83);
        Stu[3] = new Student("Dikshant",84);
        Stu[4] = new Student("Mitanshi",85);
        Stu[5] = new Student("Insiya",86);
        Stu[6] = new Student("Khushi",87);
        Stu[7] = new Student("Yutika",88);
        Stu[8] = new Student("Anusha",89);
        Stu[9] = new Student("Amil",90);
        try
        {
            Stu[10] = new Student();
            Stu[10].print("sidhu",111);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Do not cross size of array"  + e );
        }
    }
}