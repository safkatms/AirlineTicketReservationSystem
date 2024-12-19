import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;
import accessories.*;


public class Start
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		boolean repeat = true;
		BookingServer b= new BookingServer();
		FileReadWrite frw = new FileReadWrite();
		Delay dly = new Delay();

		System.out.println("----------------------------------------------");
		System.out.println("           AirLine Reservation System          ");
		System.out.println("----------------------------------------------");

		label1: while(repeat)
		{
			 
            dly.delay(null, 0);
			System.out.println("\nWhat do you want to do?\n");
			System.out.println("\t1. Admin Login");
			System.out.println("\t2. User Login");
			System.out.println("\t3. About us");
			System.out.println("\t4. Exit\n");

			System.out.print("Please choose an option from above list: ");
			int choice1=sc.nextInt();
			System.out.println();

			switch(choice1)
			{
				case 1:

					System.out.println("-------------------------------------------------");
					System.out.println("		You have chosen admin login        ");
					System.out.println("-------------------------------------------------");

					System.out.print("Please enter your Username: ");
					String aduser = sc.next();

					System.out.print("Now enter your Password: ");
					String adpass = sc.next();

					if(aduser.equals("admin")&&adpass.equals("123"))

					{	System.out.println();
						System.out.println("Your login is successful\n");

						System.out.println("-------------------------------------------------");
						System.out.println("		 You are now logged in as admin        ");
						System.out.println("-------------------------------------------------");
						
						while(repeat)
						{	
							
						System.out.println("What do you want to do?\n");
						System.out.println("\t1. Add new Flight");
						System.out.println("\t2. Remove Flight ");
						System.out.println("\t3. Show all Flight");
						System.out.println("\t4. Go Back\n");

						System.out.print("Please choose an option from above list: ");
						int first=sc.nextInt();
						System.out.println();

						switch(first)
						{
							case 1:

								
								System.out.println("-------------------------------------------");
								System.out.println("	You have chosen to add new Flight     ");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Airline Name: ");
								String airLineName = sc.next();
								System.out.print("Enter Flight Number: ");
								String f_number = sc.next();
								System.out.print("Enter Depature City: ");
								String dp = sc.next();
								System.out.print("Enter Destination City: ");
								String ds = sc.next();
								System.out.print("Enter Depature Date: ");
								String dpdate = sc.next();
								System.out.print("Enter Depature Time: ");
								String dptime = sc.next();
								System.out.print("Available Seat: ");
								int sn = sc.nextInt();
								System.out.print("Fare per Seat: ");
								double f1 = sc.nextDouble();

								System.out.println();

								Flight f=new Flight();

								f.setDeparture(dp);
								f.setDestination(ds);
								f.setAirlineName(airLineName);
								f.setFNumber(f_number);
								f.setQuantity(sn);
								f.setDeparture_date(dpdate);
								f.setDeparture_time(dptime);
								f.setFare(f1);


								b.addFlight(f);

								break ;
							
							case 2: 

								System.out.println("-------------------------------------------");
								System.out.println("	You have chosen to remove a Flight     ");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Flight Number: ");
								String fn=sc.next();

								System.out.println();

								b.removeFlight(b.getflight(fn));

								break ;

							case 3:

								System.out.println("-------------------------------------------");
								System.out.println("	You have chosen to show all Flight 		");
								System.out.println("-------------------------------------------");	

								b.showAllFlight();

								break ;

							case 4:
													
							continue label1;

							default:
													
							System.out.println("Invalid Input");
							break;

						}

						}

					}

					else{System.out.println("Wrong Password");}
					break;

				case 2:

					System.out.println("--------------------------------------------------");
					System.out.println("		You have chosen User login          ");
					System.out.println("--------------------------------------------------");

					System.out.print("Please enter your Username: ");
					String user = sc.next();

					System.out.print("Now enter your Password: ");
					String pass = sc.next();

					if (user.equals("user")&&pass.equals("123"))
					{

						System.out.println();
						System.out.println("Your login is successful\n");

						System.out.println("-------------------------------------------------");
						System.out.println("		  You are now logged in as user          ");
						System.out.println("-------------------------------------------------");


						while(repeat)
						{

							System.out.println("What do you want to do?\n");
							System.out.println("\t1. Book Flight");
							System.out.println("\t2. Cancel Booking ");
							System.out.println("\t3. Show your Reservation");
							System.out.println("\t4. Go Back\n");

							System.out.print("Please choose an option from above list: ");
							int first1=sc.nextInt();
							System.out.println();

							switch(first1)
							{
								case 1:

									System.out.println("--------------------------------------------");
									System.out.println("	  You have chosen to book a Flight      ");
									System.out.println("--------------------------------------------");

									System.out.println();
									//System.out.println("-------------------------------------------------");
									System.out.println("		         Available Flight                 ");
									System.out.println("---------------------------------------------------");

									//System.out.println();

									b.showAllFlight();

									System.out.print("Enter Flight Number you want to book: ");
									String fNumber1 = sc.next();

									Passenger p = null;
									double a;

									System.out.print("Enter number of seat: ");
									int quantity1 = sc.nextInt();
									System.out.print("Enter your Name : ");
									String n = sc.next();
									System.out.print("Enter your Nid Number : ");
									int nid = sc.nextInt();
									// System.out.print("Enter Date of Birth : ");
									// String dob = sc.next();
									System.out.print("Enter Gender : ");
									String gen = sc.next();
									// System.out.print("Enter Address : ");
									// String address = sc.next();
									System.out.print("Enter Email Address : ");
									String eaddress = sc.next();
									System.out.print("Enter valid phone Number : ");
									String phn = sc.next();

									System.out.println();

									System.out.println("  *** Please make your payment to confirm the booking ***\n");
									a=b.getflight(fNumber1).getFare()*(double)quantity1;
									System.out.println("Your payable Amount: "+a);
									System.out.println();

									System.out.print("Enter your Bank Account Number: ");
									int acn = sc.nextInt();
									System.out.print("Enter Amount: ");
									int amount = sc.nextInt();

									Passenger p1=new Passenger();

									p1.setPName(n);
									p1.setNID(nid);
									p1.setQuantity(quantity1);
									p1.setPGender(gen);
									//p1.setFare(fare1);
									p1.setPEmail(eaddress);
									p1.setPhnNumber(phn);

									p = p1;



									if(p!=null)
										{
									 		System.out.println();
									   	
											b.getflight(fNumber1).insertPassenger(p,amount);
										}
										//if ()

										break;


								case 2:

									System.out.println("------------------------------------------------------");
									System.out.println("	You have chosen to cancel the booking ");
									System.out.println("------------------------------------------------------");

									
									System.out.print("Enter Flight Number: ");
									String fNumber2 = sc.next();

									System.out.print("Enter your NID number: ");
									int nid2= sc.nextInt();


									b.getflight(fNumber2).removePassenger(b.getflight(fNumber2).getPassenger(nid2));

									break;

								case 3 :

									System.out.println("-----------------------------------------------------");
									System.out.println("	You have chosen to show Reservation");
									System.out.println("------------------------------------------------------");

									System.out.print("Enter Flight Number: ");
									String fNumber3=sc.next();

									System.out.print("Enter your NID number: ");
									int nid3= sc.nextInt();


									 //b.getflight(fNumber3).showAllPassenger();
									b.getflight(fNumber3).showPassenger(nid3);


									break;

								case 4:
													
									continue label1;

								default:
															
								System.out.println("Invalid Input\n");
								break;



							}


						}
					}

					else{System.out.println("Wrong Password");}
					break;

				case 3: 

					frw.writeInFile(" ");

					frw.readFromFile();

					break;

				case 4:

					System.out.println("You have selected to exit the application\n");
					
					repeat = false;
					break;
					
				default:
				
					System.out.println("Invalid Input\n");
					break;
				

			}


		}
		
				
	}
		
}