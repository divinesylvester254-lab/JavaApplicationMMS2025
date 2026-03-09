import java.util.Scanner;

public class CandidatesDetails{
	private String name, qualification, status;
	private int age;
	
	public void getCandidatesDetails(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = scan.next();
		
		System.out.println("Enter your qualification: ");
		qualification = scan.next();
		
		System.out.println("Enter your age: ");
		age = scan.nextInt();
		AgeValidation obj = new AgeValidation();
		obj.validationAge();
	}
	private class AgeValidation{
		public void validationAge(){
			if (age >= 21 && age <= 25){
				status = "selected";
			}
			else{
				status = "rejected";
			}
		}
	}
	public void printCandidateDetails(){
		System.out.println("Name: " +name);
		System.out.println("Qualification: " + qualification);
		System.out.println("Age: " + age);
		System.out.println("Selection status: " + status);
	}
	public static void main(String[] args){
		CandidatesDetails candidate = new CandidatesDetails();
		candidate.getCandidatesDetails();
		candidate.printCandidateDetails();
		
	}
}