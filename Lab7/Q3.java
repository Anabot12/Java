package Lab7;
class NonNum extends Exception
{
    private static final long serialVersionUID=1L;
    /**
     * 
     */
    NonNum()
    {
        super("The value is non numeric ");

    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

class Q3 
{
    public static void main(String args[]) 
    {
        int a,b,c=0;
        try
        {
            a=Integer.parseInt(args[0]);
            throw new NonNum();
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(NonNum e)
        {
            System.out.println(e);
        }
}
}


