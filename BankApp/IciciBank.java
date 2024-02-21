package BankApp;

public class IciciBank extends Bank{
	
	@Override
	void amount() {
		
		System.out.println("Amount Approved : 5 Lakh");		
	}
	@Override
	void roi() {
		System.out.println("Rate of Interest : 7.5 pa");
	}
	@Override
	void time() {
		System.out.println("Time : 5 years");
	}
}

