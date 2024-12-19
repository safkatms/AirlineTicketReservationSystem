package accessories;

public class Delay
{
    /*--------------------------------------
	          The delay
    ---------------------------------------*/

    public void delay(String message, int sec)

    {
        int timeToWait = 3; // in second
        System.out.print("\t\tPlease Wait.");
        
        try 
		{
            for (int i = 0; i < timeToWait; i++) 
			{
                Thread.sleep(500);
                System.out.print(".");
            }
        } 
		catch (InterruptedException ie) 
		{
            Thread.currentThread().interrupt();
        }
    }
}