package BankApp;

public class BankFactory {
   public void get(Bank b) {
	   if(b instanceof IndianBank) {
		   IndianBank ib = (IndianBank)b;
		   System.out.println("Welcome to IndianBank");
		   ib.amount();
		   ib.roi();
		   ib.time();
	   }
	   else if(b instanceof IciciBank) {
		   IciciBank ic = (IciciBank)b;
		   System.out.println("Welcome to IciciBank");
		   ic.amount();
		   ic.roi();
		   ic.time();
	   }
	   else if(b instanceof Sbi) {
		   Sbi s = (Sbi)b;
		   System.out.println("Welcome to SBI Bank");
		   s.amount();
		   s.roi();
		   s.time();
	   }
	 
	 
   }
}
