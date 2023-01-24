package Lab6;
public class Trunk_Call 
{
    int ordinary_rate=10;
    int urgent_rate=20;
    int lighting_rate=30;
    public static void main (String args[])
    {
        ordinary a =new ordinary();
        a.charges(1);
        urgent b =new urgent();
        b.charges(2);
        lighting c =new lighting();
        c.charges(3);
    }
}
class ordinary extends Trunk_Call
{
    void charges(int hours)
    {
        System.out.println(ordinary_rate*hours);
    }
}
class urgent extends Trunk_Call{
    void charges(int hours)
    {
        System.out.println(urgent_rate*hours);
    }
}
class lighting extends Trunk_Call
{
    void charges (int hours)
    {
        System.out.println(lighting_rate*hours);
    }
}