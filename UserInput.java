import java.util.scanner;

public class UserInput{
	public static void main(string[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		string fullName = scan.nextLine();
		
		System.out.print("Enter your address: ");
		string address = sca.nextLine();
		
	    System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.print("Enter your gender (M/F): ");
		char gender = scan.next().charAt(0);
		
		
		System.out.printf("Are you happy to learn Java?(True/False): ");
		boolean isHappy = scan.nextBoolean();
		System.out.printin("");
		System.out.printin("");
		
		
		System.out.printf("Hello %s, How are you today?%n",fullName);
		System.out.printf("Nice meetin you, you are living in %s%n",address);
		System.out.printf("%s You are %d years old%n",fullName,age);
		System.out.printf("You are a %c %n",gender);
		System.out.printf("It is %b that you are happy to learn Java %n",isHappy);
	}
}