package Lab6;

class Worker
{
    String name="Ananya";
    int salary_rate=20;
    public static void main(String args[])
    {
        Daily_Worker d=new Daily_Worker();
        d.ComPay(30);
        Salaried_Worker s=new Salaried_Worker();
        s.ComPay(30);
    }
}
class Daily_Worker extends Worker{
    void ComPay(int hours)
    {
        System.out.println(salary_rate*hours);
    }
}
class Salaried_Worker extends Worker
{
    void ComPay(int hours)
    {
    System.out.println(salary_rate*40);
}
}
    