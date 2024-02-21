package BankApp;
import java.util.Scanner;
public class MainOfBank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your option");
		System.out.println("1.IndianBank\n2.IciciBank\n3.Sbi");
		System.out.println("*************************************");
		BankFactory bf = new BankFactory();
		int choice = scan.nextInt();
		switch(choice) {
			case 1:bf.get(new IndianBank());
			break;
			case 2:bf.get(new IciciBank());
			break;
			case 3:bf.get(new Sbi());
			break;                             
			default:System.out.println("Invalid choice");
		}
	}
}
