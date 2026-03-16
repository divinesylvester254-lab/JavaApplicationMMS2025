import java.util.Scanner;

public class StudentResult{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Math Score: ");
		int math = input.nextInt();
		
		System.out.print("Enter English Score: ");
		int english =  input.nextInt();
		
		System.out.print("Enter Science Score: ");
		int science = input.nextInt();
		
		int total = math + english + science;
		double average = total / 3.0;
		
		char grade;
		
		if(average >= 70) grade = 'A';
		else if(average >= 60) grade = 'B';
		else if(average >= 50) grade = 'C';
		else if(average >= 40) grade = 'D';
		else grade = 'F';
		
		System.out.println("\nStudent Name: " + name);
		System.out.println("Total Score: " + total);
		System.out.println("Average Score: " + average);
		System.out.println("Grade: " + grade);
		
	}		
}