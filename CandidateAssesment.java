import java.util.Scanner;

public class CandidateAssesment{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter English score: ");
		int English = input.nextInt();
		
		System.out.print("Emter Maths score: ");
		int Maths = input.nextInt();
		
		System.out.print("Enter ICT score: ");
		int ICT = input.nextInt();
		

		
		double Average = (English + Maths + ICT);
		
		if(English >= 70){
			if(Average >= 80){
			System.out.printf("%d is your English score and %f is your average score.%n",English,Average);
			System.out.print("You have been ACCEPTED.");
		}
		else{
			System.out.print("You did not meet the requirement.");
		}
			}
	}
	
}
	

