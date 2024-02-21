package BankApp;

public class IndianBank extends Bank{
	
	@Override
	void amount() {
	
		System.out.println("Amount Approved : 10 Lakh");		
	}
	@Override
	void roi() {
		System.out.println("Rate of Interest : 10.5 pa");
	}
	@Override
	void time() {
		System.out.println("Time : 10 years");
	}
}
