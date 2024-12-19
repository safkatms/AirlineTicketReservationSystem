package interfaces;
import classes.*;
import java.lang.*;

public interface PassengerIOperations
{
	void insertPassenger(Passenger p,int amount);
	void removePassenger(Passenger p);
	void showAllPassenger();
	Passenger getPassenger(int nid);
	void showPassenger(int nid);
	void showinfo();
}