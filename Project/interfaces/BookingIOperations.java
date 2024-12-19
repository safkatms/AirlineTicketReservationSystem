package interfaces;
import classes.*;
import java.lang.*;

public interface BookingIOperations
{
	void addFlight(Flight f);
	void removeFlight(Flight f);
	void showAllFlight();
	Flight getflight(String fNumber);

}