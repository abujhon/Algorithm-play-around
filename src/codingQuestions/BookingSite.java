package codingQuestions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookingSite {
	static String dest;
	static String from;
	
	public static void main(String[] args) {
		AirplaneTicketing air=new AirplaneTicketing(20, 4);
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to DELTA AIRLINES ! \n Please Enter Which City to ?");
		 dest=scan.nextLine();
		System.out.println("Please Enter Whcih City From ?");
		from=scan.nextLine();
		
		boolean flag= false;
		while (flag=true) {
		System.out.println("Which Class do you want to ? Economy or Business ?");
		String option=scan.nextLine();
		if(option.equalsIgnoreCase("Economy")){
			System.out.println("Available Economy Seats are --> " +air.getEconomyClass());
			if (air.getEconomyClass()>0) {
			System.out.println("How Many Tickets you want ?");
			int numTicket=scan.nextInt();
			if(numTicket>0 && numTicket< air.getEconomyClass()){
				air.economyTicket(numTicket);
				if (numTicket==1) {
				System.out.println("Have A Pleasant Trip With Us.");
				System.out.println("Your Seat is -->  ROW 3 - D " );
				}else{
					System.out.println("Have A Pleasant Trip With Us.");
					for (int i = 1; i <= numTicket; i++) {
						System.out.println("Your Seat is -->  ROW "+ i +" - D " );
					}
				}
				break;
			}
			}else{
				System.out.println("No Economy Class Seats Available.");
				continue;
			}
		
		}else if(option.equalsIgnoreCase("Business")){
			System.out.println("Available BusinessClass Seats are --> "+ air.getBusinessClass());
			if (air.getBusinessClass()>0) {
			System.out.println("How Many Tickets you want ?");
			int numTicket=scan.nextInt();
			if (numTicket>0 && numTicket < air.getBusinessClass()) {
				air.businessTicket(numTicket);
				if (numTicket==1) {
					System.out.println("Have A Pleasant Trip With Us.");
					System.out.println("Your Seat is -->  ROW 3 - D " );
					}else{
						System.out.println("Have A Pleasant Trip With Us.");
						for (int i = 1; i <= numTicket; i++) {
							System.out.println("Your Seat is -->  ROW "+ i +" - A " );
						}
				
				break;
			}
			}else{
				System.out.println("No Business Class Seats Available.");
				continue;
			}
			}
		}else{
			System.out.print("Your Input is Not Valid.  ");
			System.out.println("Please Enter Valid Seat Option.");
			continue;
		}
		}
		
		scan.close();
		
	}
	
	
	public void setBusinessSeat(){
		Map<String, String> BusinessSeat = new TreeMap<String, String>();
		BusinessSeat.put("ROW 1", "A");
		BusinessSeat.put("ROW 1", "B");
		BusinessSeat.put("ROW 1", "C");
		BusinessSeat.put("ROW 1", "D");
	}
	public void seEconomySeat(){
		Map<String, String> EconomySeat = new TreeMap<String, String>();
		EconomySeat.put("ROW 2", "A");
		EconomySeat.put("ROW 2", "B");
		EconomySeat.put("ROW 2", "C");
		EconomySeat.put("ROW 2", "D");
		
		EconomySeat.put("ROW 3", "A");
		EconomySeat.put("ROW 3", "B");
		EconomySeat.put("ROW 3", "C");
		EconomySeat.put("ROW 3", "D");
		
		EconomySeat.put("ROW 4", "A");
		EconomySeat.put("ROW 4", "B");
		EconomySeat.put("ROW 4", "C");
		EconomySeat.put("ROW 4", "D");
		
		EconomySeat.put("ROW 5", "A");
		EconomySeat.put("ROW 5", "B");
		EconomySeat.put("ROW 5", "C");
		EconomySeat.put("ROW 5", "D");
		
		EconomySeat.put("ROW 6", "A");
		EconomySeat.put("ROW 6", "B");
		EconomySeat.put("ROW 6", "C");
		EconomySeat.put("ROW 6", "D");
	}
}


