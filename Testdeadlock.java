public class Testdeadlock 
{
    public static void main(String[] args)
{
    String R1 = "Astitva";
    String R2 = "Ananya";
    String R3 = "Akshit";
    String R4 = "Dikshant";
    Thread T1 = new Thread()
    {
        public void run()
        {
            synchronized (R1)
            {
                System.out.println("Thread 1 - locked resource 1");
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e){}
                synchronized (R2)
                {
                    System.out.println("Thread 1 - locked resource 2");
                }
            }
        }
    };
    Thread T2 = new Thread()
    {
        public void run()
        {
            synchronized (R2)
            {
                System.out.println("Thread 2 - locked resource 2");
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e){}
                synchronized (R1)
                {
                    System.out.println("Thread 2 - locked resource 1");
                }
            }
        }
    };
    Thread T3 = new Thread()
    {
        public void run()
        {
            synchronized (R3)
            {
                System.out.println("Thread 3 - locked resource 3");
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e){}
                synchronized (R4)
                {
                    System.out.println("Thread 2 - locked resource 4");
                }
            }
        }
    };
    Thread T4 = new Thread()
    {
        public void run()
        {
            synchronized (R4)
{
System.out.println("Thread 4 - locked resource 4");
try
{
Thread.sleep(100);
}
catch(Exception e)
{}
synchronized (R3)
{
System.out.println("Thread 2 - locked resource 3");
}
}
}
};


T1.start();
T2.start();
T3.start();
T4.start();
}
}