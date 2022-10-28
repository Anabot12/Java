package Lab6;
public class Player
{
    String name="Ananya mathur";
    int player_number=1;
    public static void main (String args[])
    {
        Cricket_Player obj1= new Cricket_Player();
        obj1.cricket();
        Football_Player obj2= new Football_Player();
        obj2.football();
        Hockey_Player obj3 = new Hockey_Player();
        obj3.hockey();
    }
}
class Cricket_Player extends Player
{
    public void cricket()
    {
        System.out.println("The name of the player is: "+name+"and the player number is:"+player_number+"");
    }
}
class Football_Player extends Player
{
    public void football()
    {
        System.out.println("The name of the player is: "+name+"and the player number is:"+player_number+"" );
    }
}
class Hockey_Player extends Player
{
    public void hockey()
    {
        System.out.println("The name of the player is: "+name+"and the player number is:"+player_number+"");
    }
}


