package classes;
import java.lang.*;
import interfaces.*;

public class BookingServer implements BookingIOperations
{
	private Flight flights[]= new Flight[323];


	public void addFlight(Flight f)
	{
		int flag = 0;
		for(int i=0; i<flights.length; i++)
		{
			if(flights[i] == null)
			{
				flights[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Flight sucessfully added\n");
		}
		else
		{
			System.out.println("Adding Flight is unsuccesful\n");
		}
	}

	public void removeFlight(Flight f)
	{
		int flag = 0;
		for(int i=0; i<flights.length; i++)
		{
			if(flights[i] == f)
			{
				flights[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Flight succesfully removed\n");}
		else{System.out.println("Flight can not remove\n");}
	}

	public void showAllFlight()
	{
		for(int i=0; i<flights.length; i++)
		{
			if(flights[i] != null)
			{
    			flights[i].showinfo();
    			//System.out.println();
			}
		}
		System.out.println();
	}

	public Flight getflight(String fNumber)
	{
		Flight f = null;
		
		for(int i=0; i<flights.length; i++)
		{
			if(flights[i] != null)
			{
				if(flights[i].getFNumber().equals(fNumber))
				{
					f = flights[i];
					break;
				}
			}
		}
		if(f != null)
		{
			System.out.println("Flight Found");
			//f.showinfo();

		}
		else
		{
			System.out.println(" Flight Not Found");
		}
		return f;
	}
	


}