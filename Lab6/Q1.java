package Lab6;
class Q1
{
    private int weight=90;
}
class Q2 extends Q1
{
    private void msg()
    {
        System.out.println("hello this is lab6");
    }
}
class Q3 extends Q2
{
    public void hello()
    {
        System.out.println("hello this is the third class of lab6");
    }
}
class hello_inheritance
{
    public static void main(String[] args)
    {
        Q2 obj= new Q2();
        Q3 obj=new Q3();
        obj.msg();
        obj.hello();
       System.out.println(obj.weight);
    }
}