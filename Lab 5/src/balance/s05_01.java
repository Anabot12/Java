package balance;
class s05_01
{
public static void main(String ar[])
{
try
{
balance.account a=new balance.account();
a.read();
a.disp();
}
catch(Exception e)
{ System.out.println(e); }
}
}
