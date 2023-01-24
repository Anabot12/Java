class To show that private member of a super class cannot be accessed from derived classes
{
    public public static void main(String args[])
    int a,b;
    To show that private member of a super class cannot be accessed from derived classes(int x,int y)
    {
    a=x; b=y;
    }
    int area()
    {
    return(a*b);
    }
}
class class_room extends To show that private member of a super class cannot be accessed from derived classes
{
    int h;
    class_room(int x,int y,int z)
{
    super(x,y);
    h=z;
}
int volume()
{
    return(area()*h);
}
}
class Mathur
{
    public static void main(String args[])
{
    class_room cr=new class_room(12,15,30);
    int a1=cr.area();
    int v1=cr.volume();
    System.out.println("Area of Room: "+a1);
    System.out.println("Volume of Room : "+v1);
}
}
