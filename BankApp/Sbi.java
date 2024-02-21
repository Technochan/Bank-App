package BankApp;

public class Sbi extends Bank{
	
	@Override
	void amount() {
		
		System.out.println("Amount Approved : 15 Lakh");		
	}
	@Override
	void roi() {
		System.out.println("Rate of Interest : 14.5 pa");
	}
	@Override
	void time() {
		System.out.println("Time : 15 years");
	}
}
