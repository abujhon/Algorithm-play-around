package codingQuestions;

public class AirplaneTicketing {
	private int economyClass;
	private int businessClass;
	
	public AirplaneTicketing(int economy,int businessClass) {
		this.economyClass=economy;
		this.businessClass=businessClass;
	}

	public int getEconomyClass() {
		return economyClass;
	}

//	public void setEconomyClass(int economyClass) {
//		this.economyClass = economyClass;
//	}

	public int getBusinessClass() {
		return businessClass;
	}

//	public void setBusinessClass(int businessClass) {
//		this.businessClass = businessClass;
//	}
	
	public void economyTicket(int numberOfTicket){
		if(numberOfTicket>0 && numberOfTicket < economyClass){
			updateEconomyTicket(numberOfTicket);
		}
		
	}
	
	private int updateEconomyTicket(int ticket){
		return this.economyClass-=ticket;
	}
	public void businessTicket(int numberOfTicket){
		if (numberOfTicket> 0 && numberOfTicket < businessClass) {
			updateBusinessTicket(numberOfTicket);
		}
		
	}
	
	private int updateBusinessTicket(int ticket){
		return this.businessClass-=ticket;
	}

}
