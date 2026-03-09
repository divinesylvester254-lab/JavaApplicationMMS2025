import java.util.Scanner;

public class ParkingCharges{
	public static double calculateCharges(double hours){
		double charge = 2.0;
		
		if (hours > 3){
			charge = 2.0 + (Math.ceil(hours - 3) * 0.5);
		}
		
		if (charge > 10.0)
			charge = 10.0;
		
		return charge;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double total = 0;
		
		for (int i = 1; i <= 3; i++){
			System.out.print("Enter hours parked for customer "+ i +": ");
			double hours = input.nextDouble();
			
			double charge = calculateCharges(hours);
			
			System.out.println("Charge: $" + charge);
            total += charge;			
		}
		
		System.out.println("Total receipts: $" + total);
	}
}