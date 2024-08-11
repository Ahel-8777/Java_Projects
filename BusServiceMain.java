import java.util.Scanner;
class BusService
{
	//Bus Routes
	
	String route_id;
	String source;
	String destination;
	int stops;
	double distance;
	
	//Bus Information
	
	String capacity;
	String bus_number;
	String bus_type;

	//Driver Details

	int driver_id;
	String driver_name;
	long driver_phno;

	//Passenger Details
	int ticket_id;
	int ticket_price;
	String passenger_name;
	long passenger_phno;
	
	
	
	

	BusService(String route_id, String source, String destination, String bus_number, int driver_id, int ticket_id, int ticket_price)
	{
		this.route_id = route_id;
		this.source = source;
		this.destination = destination;
		this.bus_number = bus_number;
		this.driver_id = driver_id;
		this.ticket_id = ticket_id;
		this.ticket_price = ticket_price;
		
	}
	

	void alldetails()
	{
		System.out.println("This are the Route Details");
		busroutedetails();
		System.out.println("This are the Bus Informations");
		businfodetails();
		System.out.println("This are the Driver Details");
		busdriverdetails();
		System.out.println("This are the Passenger Details");
		buspassengerdetails();	
	}

	void busroutedetails()
	{
	
		System.out.println("Route ID of " + route_id + " which is leaving from " + source + " towards " + destination + " and the number of stops are " + stops +" and the total distance is " + distance + " KM ");
	}
	
	void businfodetails()
	{
		System.out.println(" The total capacity of the bus is " + capacity + " and the bus number is " + " also it is a " + bus_type + " bus ");
	}

	void busdriverdetails()
	{
		System.out.println(" The driver id and name of the driver is " + driver_id + " , " + driver_name +  " and his contact number is " + driver_phno);
	}

	void buspassengerdetails()
	{
		System.out.println(" The passenger ticket id and the name of the passenger are " + ticket_id + " , " + passenger_name + " and the ticket fare is " + ticket_price + " for contacting with the passenger please call on " + passenger_phno);
	}
			
}


class BusServiceMain
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the Route ID: ");
		String route_id = sc1.nextLine();
		
		System.out.println("Enter the source: ");
		String source = sc1.nextLine();

		System.out.println("Enter the destination: ");
		String destination = sc1.nextLine();

		System.out.println("Enter the Number of Stops: ");
		int stops = sc2.nextInt();
		
		System.out.println("Enter the total distance which is being covered: ");
		double distance = sc2.nextDouble();

		System.out.println("Enter the Bus Capacity: ");
		String capacity = sc1.nextLine();

		System.out.println("Enter the Bus Number: ");
		String bus_number = sc1.nextLine();

		System.out.println("Enter the Bus Type: ");
		String bus_type = sc1.nextLine();
	
		System.out.println("Enter the Driver ID: ");
		int driver_id = sc2.nextInt();
		
		System.out.println("Enter the name of the driver: ");
		String driver_name = sc1.nextLine();

		System.out.println("Enter the Driver Contact Number: ");
		long driver_phno = sc2.nextLong();
	
		System.out.println("Enter the Ticket ID: ");
		int ticket_id = sc2.nextInt();
		
		System.out.println("Enter the Fare of the Ticket: ");
		int ticket_price = sc2.nextInt();
		
		System.out.println("Enter the Name of the Passenger: ");
		String passenger_name = sc1.nextLine();

		System.out.println("Enter the Passenger Contact Number: ");
		long passenger_phno = sc2.nextLong();
		
		

		BusService b1 = new BusService(route_id, source, destination, bus_number, driver_id, ticket_id, ticket_price);
		
		b1.stops = stops;
		b1.distance = distance;
		b1.capacity = capacity;
		b1.bus_type =  bus_type;
		b1.driver_name = driver_name;
		b1.driver_phno = driver_phno;
		b1.passenger_name = passenger_name;
		b1.passenger_phno = passenger_phno;

		System.out.println("Press 1 to see all details ");
		System.out.println("Press 2 to see only the bus routes ");
		System.out.println("Press 3 to see the bus information ");
		System.out.println("Press 4 to see the driver details ");
		System.out.println("Press 5 to see the passenger details ");
        System.out.println("  ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		switch(x)
		{
			case 1:
				b1.alldetails();
				break;
			case 2:
				b1.busroutedetails();
				break;
			case 3:
				b1.businfodetails();
				break;
			case 4:
				b1.busdriverdetails();
				break;
			case 5:
				b1.buspassengerdetails();
				break;	
			default:
				System.out.println("Invalid Entry");
		}
        sc1.close();
        sc2.close();
        sc.close();
        
    

		
	}
}
