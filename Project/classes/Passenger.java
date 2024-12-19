package  classes;
import java.lang.*;

public class Passenger
{
	protected String pName, pGender,pEmail,phnNumber; 
	protected int nid, quantity;
	
	public Passenger()
	{
	}
	public Passenger(String pName,int nid,int age,String pGender,String pEmail,String phnNumber)
	{
		this.pName = pName;
		this.nid = nid;
		this.quantity = quantity;
		this.pGender = pGender;
		this.pEmail = pEmail;
		this.phnNumber = phnNumber ;
	}
	public void setPName (String pName)
	{
		this.pName = pName;
	}
	public void setNID(int nid)
	{
		this.nid = nid;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public void setPGender(String pGender )
	{
		this.pGender = pGender;
	}
	public void setPEmail(String pEmail)
	{
		this.pEmail=pEmail;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber=phnNumber;
	}

	public String getPName()
	{
		return pName;
	}
	public int getNID()
	{
		return nid;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getPGender()
	{
		return pGender;
	}
	public String getPEmail()
	{
		return pEmail;
	}
	public String getPhnNumber()
	{
		return phnNumber;
	}
	
	public void showPDetails()
	{
		System.out.println("Number of seat\t\t: "+quantity);
		System.out.println("Passenger Name\t\t: "+pName);
		System.out.println("Passenger NID\t\t: "+nid);
 		System.out.println("Passenger Gender\t: "+pGender);
 		System.out.println("Passenger Email\t\t: "+pEmail);
 		System.out.println("Passenger Phone Number\t: "+phnNumber);
 	
		
	}
}